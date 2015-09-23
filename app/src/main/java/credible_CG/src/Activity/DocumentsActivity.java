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
import credible_CG.src.R;
import credible_CG.src.extra.AppController;
import credible_CG.src.Model.File;

public class DocumentsActivity extends OpportunityActivity {
    ListView pdfFileLV;

    AppController appController;
    FileListAdapter listAdapter;
    String[] fileNames = {"Electronics, IT and ITeS Investment Policy of Chhattisgarh 2014-19", "Chhattisgarh BPM investment",
            "Credible Chhattisgarh", "Ease of Doing Business"
    };
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
                            OpenPdfFromUrl("https://s3-ap-southeast-1.amazonaws.com/opportunity-chhattisgarh-2015/CG+IT+POLICY+2014-19.pdf");
                            break;
                        case 1:
//                            CopyReadAssets("electonics presentation .pdf");
                            OpenPdfFromUrl("https://s3-ap-southeast-1.amazonaws.com/opportunity-chhattisgarh-2015/Chhattisgarh+BPM+investment.pdf");
                            break;
                        case 2:
//                            CopyReadAssets("IT-IT SEZ promotion presentation.pdf");
                            OpenPdfFromUrl("https://s3-ap-southeast-1.amazonaws.com/opportunity-chhattisgarh-2015/Credible+Chhattisgarh.pdf");
                            break;
                        case 3:
                            OpenPdfFromUrl("https://s3-ap-southeast-1.amazonaws.com/opportunity-chhattisgarh-2015/Ease+of+Doing+Business.pdf");
//                            CopyReadAssets("CG IESA Vision Summit sans videos.pdf");
                            break;
//                        case 4:
//                            OpenPdfFromUrl("https://s3-ap-southeast-1.amazonaws.com/opportunity-chhattisgarh-2015/Chhattisgarh+-+SEZ+Policy+2011.pdf");
////                            CopyReadAssets("Chhattisgarh - SEZ Policy 2011.pdf");
//                            break;
//                        case 5:
//                            OpenPdfFromUrl("https://s3-ap-southeast-1.amazonaws.com/opportunity-chhattisgarh-2015/Chhattisgarh+State+Profile.pptx");
////                            CopyReadAssets("Chhattisgarh State Profile.pptx");
//                            break;
//                        case 6:
//                            OpenPdfFromUrl("https://s3-ap-southeast-1.amazonaws.com/opportunity-chhattisgarh-2015/Ease+of+doing+business.pptx");
////                            CopyReadAssets("Ease of doing business.pptx");
//                            break;
//                        case 7:
//                            OpenPdfFromUrl("https://s3-ap-southeast-1.amazonaws.com/opportunity-chhattisgarh-2015/CG+NASSCOM+Exec+Comm+Meeting.pptx");
////                            CopyReadAssets("CG NASSCOM Exec Comm Meeting.pptx");
//                            break;
                    }
                } catch (Exception e) {
                    final AlertDialog alertDialog = new AlertDialog.Builder(DocumentsActivity.this).create();
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
        super.initViews(getResources().getDrawable(R.drawable.logo_new), "IT/ITeS", getResources().getDrawable(R.drawable.credible_cg), null, null);
    }


//    private void CopyReadAssets(String fileName) {
//        AssetManager assetManager = getAssets();
//
//        InputStream in = null;
//        OutputStream out = null;
//        File file = new File(getFilesDir(), fileName);
//        try {
//            in = assetManager.open(fileName);
//            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
//
//            copyFile(in, out);
//            in.close();
//            in = null;
//            out.flush();
//            out.close();
//            out = null;
//        } catch (Exception e) {
//            Log.e("tag", e.getMessage());
//        }
//
//        Intent intent = new Intent(Intent.ACTION_VIEW);
//        if(fileName.contains(".pdf"))
//            intent.setDataAndType(
//                    Uri.parse("file://" + getFilesDir() + "/" + fileName),
//                    "application/pdf");
//        if (fileName.contains(".pptx"))
//            intent.setDataAndType(
//                    Uri.parse("file://" + getFilesDir() + "/" + fileName),
//                    "application/vnd.ms-powerpoint");
//
//        startActivity(intent);
//    }
//
//    private void copyFile(InputStream in, OutputStream out) throws IOException {
//        byte[] buffer = new byte[1024];
//        int read;
//        while ((read = in.read(buffer)) != -1) {
//            out.write(buffer, 0, read);
//        }
//    }


    void OpenPdfFromUrl(String url) {
        String googleDocsUrl = "http://docs.google.com/gview?embedded=true&url=";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(Uri.parse(googleDocsUrl + url), "text/html");
        startActivity(intent);
    }

}
