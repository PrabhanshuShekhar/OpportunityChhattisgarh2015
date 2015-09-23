package credible_CG.src.Activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import credible_CG.src.Adapter.FileListAdapter;
import credible_CG.src.Model.File;
import credible_CG.src.R;
import credible_CG.src.extra.AppController;

/**
 * Created by prabhanshu on 9/23/15.
 */
public class NayaRaipurActivity extends  OpportunityActivity {
    ListView pdfFileLV;

    AppController appController;
    FileListAdapter listAdapter;


    String[] fileNames = {"NRDA"};
    List<File> fileList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_documents);
        super.setToolbar();
        initThings();
        initViews();
        pdfFileLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                try {
                    switch (position) {
                        case 0:
//                            CopyReadAssets("CG IT POLICY 2014-19.pdf");
                            OpenPdfFromUrl("https://s3-ap-southeast-1.amazonaws.com/opportunity-chhattisgarh-2015/NRDA+BRCHR+IDW+for+print.pdf");
                            break;
                    }
                } catch (Exception e) {
                    final AlertDialog alertDialog = new AlertDialog.Builder(NayaRaipurActivity.this).create();
                    alertDialog.setTitle("");
                    alertDialog.setMessage("You dont have PDF Reader app Please Download it from Google Play.");

                    alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            alertDialog.dismiss();
                        }
                    });

                    alertDialog.show();
                }
            }
        });
    }

    public void initThings() {
        appController = (AppController) getApplicationContext();
        fileList = new ArrayList<>();
        for (int i = 0; i < fileNames.length; i++) {
            File f = new File();
            f.setName(fileNames[i]);
            f.setImageId(R.drawable.pdf);
            fileList.add(f);
        }
    }

    private void initViews() {
        listAdapter = (FileListAdapter) new FileListAdapter(this, R.layout.element_department_text_center, fileList);
        pdfFileLV = (ListView) findViewById(R.id.pdfFileLV);
        pdfFileLV.setAdapter(listAdapter);
        super.initViews(getResources().getDrawable(R.drawable.logo_new), "Naya Raipur", getResources().getDrawable(R.drawable.credible_cg), null, null);
    }


    void OpenPdfFromUrl(String url) {
        String googleDocsUrl = "http://docs.google.com/gview?embedded=true&url=";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(Uri.parse(googleDocsUrl + url), "text/html");
        startActivity(intent);
    }

}
