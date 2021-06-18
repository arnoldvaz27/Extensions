package com.example.differentandroidcodes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.File;
import java.util.List;

import static com.example.differentandroidcodes.MainActivity.fileEnd;

public class PdfAdapter extends RecyclerView.Adapter<PdfViewHolder> {

    private final Context context;
    private final List<File> pdfFiles;
    @NonNull
    @Override
    public PdfViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PdfViewHolder(LayoutInflater.from(context).inflate(R.layout.element_holder,parent,false));
    }

    public PdfAdapter(Context context, List<File> pdfFiles) {
        this.context = context;
        this.pdfFiles = pdfFiles;
    }

    @Override
    public void onBindViewHolder(@NonNull PdfViewHolder holder, int position) {
            holder.tvName.setText(pdfFiles.get(position).getName());
            holder.tvName.setSelected(true);
        switch (fileEnd) {
            case "JPG":
                holder.imageView.setImageResource(R.drawable.jpg);
                break;
            case "JPEG":
                holder.imageView.setImageResource(R.drawable.jpeg);
                break;
            case "PNG":
                holder.imageView.setImageResource(R.drawable.png);
                break;
            case "SVG":
                holder.imageView.setImageResource(R.drawable.svg);
                break;
            case "gif":
                holder.imageView.setImageResource(R.drawable.gif);
                break;
            case "MP4":
                holder.imageView.setImageResource(R.drawable.mp4);
                break;
            case "MP3":
                holder.imageView.setImageResource(R.drawable.mp3);
                break;
            case "PDF":
                holder.imageView.setImageResource(R.drawable.pdf);
                break;
            case "DOCX":
                holder.imageView.setImageResource(R.drawable.doc);
                break;
            case "PPTX":
                holder.imageView.setImageResource(R.drawable.ppt);
                break;
            case "XLSX":
                holder.imageView.setImageResource(R.drawable.xls);
                break;
            case "CSV":
                holder.imageView.setImageResource(R.drawable.csv);
                break;
            case "TXT":
                holder.imageView.setImageResource(R.drawable.txt);
                break;
            case "ZIP":
                holder.imageView.setImageResource(R.drawable.zip);
                break;
            case "TAR":
                holder.imageView.setImageResource(R.drawable.tar);
                break;
            case "RAR":
                holder.imageView.setImageResource(R.drawable.rar);
                break;
            case "AI":
                holder.imageView.setImageResource(R.drawable.ai);
                break;
            case "PS":
                holder.imageView.setImageResource(R.drawable.ps);
                break;
            case "AAC":
                holder.imageView.setImageResource(R.drawable.aac);
                break;
            case "HTML":
                holder.imageView.setImageResource(R.drawable.html);
                break;
            case "CSS":
                holder.imageView.setImageResource(R.drawable.css);
                break;
            case "JS":
                holder.imageView.setImageResource(R.drawable.js);
                break;
            case "JAVA":
                holder.imageView.setImageResource(R.drawable.java);
                break;
            case "JSON":
                holder.imageView.setImageResource(R.drawable.json);
                break;
            case "EXE":
                holder.imageView.setImageResource(R.drawable.exe);
                break;
            case "":
                holder.imageView.setImageResource(R.drawable.noexe);
                break;
        }

   }

    @Override
    public int getItemCount() {
        return pdfFiles.size();
    }


}
