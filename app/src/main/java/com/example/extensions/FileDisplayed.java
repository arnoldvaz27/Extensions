package com.example.extensions;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


@SuppressLint("SetTextI18n")
public class FileDisplayed extends AppCompatActivity implements onFileSelectListener{


    private RecyclerView recyclerView;
    static String fileEnd = "";
    private TextView selected,text,na;
    private ImageView empty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.color3));
        setContentView(R.layout.file_displayed);

        displayFile();
    }

    public ArrayList<File> findFile(File file) {
        ArrayList<File> arrayList = new ArrayList<>();
        File[] files = file.listFiles();

        if(files == null){
            recyclerView.setVisibility(View.GONE);
            text.setVisibility(View.VISIBLE);
            empty.setVisibility(View.VISIBLE);
        }
        else{
            for (File singleFile : files) {
                recyclerView.setVisibility(View.VISIBLE);
                empty.setVisibility(View.GONE);
                text.setVisibility(View.GONE);
                if (singleFile.isDirectory()) {
                    arrayList.addAll(findFile(singleFile));
                } else {
                    if (singleFile.getName().endsWith("."+fileEnd.toLowerCase())) {
                        arrayList.add(singleFile);
                    }
                }
            }
        }
        return arrayList;
    }

    private void displayFile() {
        text = findViewById(R.id.text);
        empty = findViewById(R.id.empty);
        na = findViewById(R.id.NA);
        selected = findViewById(R.id.selected);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        List<File> pdfList = new ArrayList<>(findFile(Environment.getExternalStorageDirectory()));
        FileAdapter fileAdapter = new FileAdapter(this, pdfList,this);
        recyclerView.setAdapter(fileAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        getMenuInflater().inflate(R.menu.menu_extension,menu);



        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);

        if(item.getItemId() == R.id.jpg){
            fileEnd = "JPG";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("JPG files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.jpeg){
            fileEnd = "JPEG";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("JPEG files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.png){
            fileEnd = "PNG";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("PNG files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.svg){
            fileEnd = "SVG";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("SVG files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.gif){
            fileEnd = "GIF";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("GIF files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.mp4){
            fileEnd = "MP4";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("MP4 files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.mp3){
            fileEnd = "MP3";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("MP3 files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.amr){
            fileEnd = "AMR";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("AMR files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.aac){
            fileEnd = "AAC";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("AAC files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.aax){
            fileEnd = "AAX";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("AAX files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.aiff){
            fileEnd = "AIFF";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("AIFF files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.opus){
            fileEnd = "OPUS";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("OPUS files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.pdf){
            fileEnd = "PDF";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("PDF files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.doc){
            fileEnd = "DOCX";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("DOC files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.ppt){
            fileEnd = "PPTX";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("PPT files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.xls){
            fileEnd = "XLSX";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("XLS files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.csv){
            fileEnd = "CSV";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("CSV files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.txt){
            fileEnd = "TXT";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("TXT files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.zip){
            fileEnd = "ZIP";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("ZIP files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.tar){
            fileEnd = "TAR";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("TAR files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.rar){
            fileEnd = "RAR";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("RAR files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.ai){
            fileEnd = "AI";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("AI files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.ps){
            fileEnd = "PS";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("PS files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.html){
            fileEnd = "HTML";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("HTML files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.css){
            fileEnd = "CSS";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("CSS files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.js){
            fileEnd = "JS";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("JS files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.java){
            fileEnd = "JAVA";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("JAVA files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.py){
            fileEnd = "PYTHON";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("PYTHON files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.json){
            fileEnd = "JSON";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("JSON files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.xml){
            fileEnd = "XML";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("XML files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.exe){
            fileEnd = "EXE";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText("EXE files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.noExtFile){
            fileEnd = "";
            displayFile();
            selected.setVisibility(View.VISIBLE);
            selected.setText(".No Extension files are displayed");
            na.setVisibility(View.GONE);
        }
        if (item.getItemId() == R.id.info) {
            Info();
        }
        return true;
    }

    private void Info() {
        AlertDialog.Builder builder = new AlertDialog.Builder(FileDisplayed.this,R.style.AlertDialog);
        builder.setTitle("Important Note");
        builder.setCancelable(false);

        final TextView groupNameField = new TextView(FileDisplayed.this);
        groupNameField.setText("1) This application only displays files from your internal storage, this application does not displays file from other sources like Memory Card, USB Memory Card, USB Pen Drive or External USB Hard disk \n\n2) If there are no files to display under a particular section than the full screen will be displayed as blank screen. ");
        groupNameField.setPadding(20,30,20,20);
        groupNameField.setTextColor(Color.BLACK);

        groupNameField.setBackgroundColor(Color.WHITE);
        builder.setView(groupNameField);

        builder.setPositiveButton("Got it", (dialogInterface, i) -> dialogInterface.cancel());

        builder.show();
    }

    @Override
    public void onFileSelected(File file) {
        Uri uri = FileProvider.getUriForFile(this, FileDisplayed.this.getApplicationContext().getPackageName() + ".provider",file);
        Intent pdfIntent = new Intent(Intent.ACTION_VIEW);
        switch (fileEnd) {
            case "JPG":
            case "JPEG":
            case "PNG":
            case "SVG":
            case "GIF":
                pdfIntent.setDataAndType(uri, "image/*");
                break;
            case "MP4":
            case "MP3":
            case "AMR":
            case "AAC":
            case "AAX":
            case "AIFF":
            case "OPUS":
                pdfIntent.setDataAndType(uri, "audio/x-wav");
                break;
            case "PDF":
                pdfIntent.setDataAndType(uri, "application/pdf");
                break;
            case "DOCX":
                pdfIntent.setDataAndType(uri, "application/msword");
                break;
            case "PPTX":
                pdfIntent.setDataAndType(uri, "application/vnd.ms-powerpoint");
                break;
            case "XLSX":
                pdfIntent.setDataAndType(uri, "application/vnd.ms-excel");
                break;
            case "CSV":
            case "PS":
            case "AI":
            case "EXE":
            case "":
                pdfIntent.setDataAndType(uri, "*/*");
                break;
            case "TXT":
            case "HTML":
            case "CSS":
            case "JS":
            case "JAVA":
            case "PYTHON":
            case "JSON":
                pdfIntent.setDataAndType(uri, "text/plain");
                break;
            case "ZIP":
                pdfIntent.setDataAndType(uri, "application/zip");
                break;
            case "TAR":
                pdfIntent.setDataAndType(uri, "application/tar");
                break;
            case "RAR":
                pdfIntent.setDataAndType(uri, "application/rar");
                break;
        }

        pdfIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        try {
            startActivity(pdfIntent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(FileDisplayed.this, "No Applications found to open this format file. You can download relevant application to view this file format", Toast.LENGTH_LONG).show();
        }
    }
}