package com.example.extensions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.File;
import java.util.List;

import static com.example.extensions.FileDisplayed.fileEnd;


public class FileAdapter extends RecyclerView.Adapter<FileViewHolder> {

    private final Context context;
    private final List<File> files;

    private final onFileSelectListener onFileSelectListener;
    @NonNull
    @Override
    public FileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FileViewHolder(LayoutInflater.from(context).inflate(R.layout.element_holder,parent,false));
    }

    public FileAdapter(Context context, List<File> files, onFileSelectListener onFileSelectListener) {
        this.context = context;
        this.files = files;
        this.onFileSelectListener = onFileSelectListener;
    }

    @Override
    public void onBindViewHolder(@NonNull FileViewHolder holder, int position) {
            holder.tvName.setText(files.get(position).getName());
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
            case "GIF":
                holder.imageView.setImageResource(R.drawable.gif);
                break;
            case "MP4":
                holder.imageView.setImageResource(R.drawable.mp4);
                break;
            case "MP3":
                holder.imageView.setImageResource(R.drawable.mp3);
                break;
            case "AMR":
                holder.imageView.setImageResource(R.drawable.amr);
                break;
            case "AAC":
                holder.imageView.setImageResource(R.drawable.aac);
                break;
            case "AAX":
                holder.imageView.setImageResource(R.drawable.aax);
                break;
            case "AIFF":
                holder.imageView.setImageResource(R.drawable.aiff);
                break;
            case "OPUS":
                holder.imageView.setImageResource(R.drawable.opus);
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
            case "MSDOT":
                holder.imageView.setImageResource(R.drawable.word);
                break;
            case "MSWBK":
                holder.imageView.setImageResource(R.drawable.word);
                break;
            case "MSDOCM":
                holder.imageView.setImageResource(R.drawable.word);
                break;
            case "MSDOTX":
                holder.imageView.setImageResource(R.drawable.word);
                break;
            case "MSDOTM":
                holder.imageView.setImageResource(R.drawable.word);
                break;
            case "MSDOCB":
                holder.imageView.setImageResource(R.drawable.word);
                break;
            case "MSPOT":
                holder.imageView.setImageResource(R.drawable.powerpoint);
                break;
            case "MSPPS":
                holder.imageView.setImageResource(R.drawable.powerpoint);
                break;
            case "MSPPTM":
                holder.imageView.setImageResource(R.drawable.powerpoint);
                break;
            case "MSPOTX":
                holder.imageView.setImageResource(R.drawable.powerpoint);
                break;
            case "MSPOTM":
                holder.imageView.setImageResource(R.drawable.powerpoint);
                break;
            case "MSPPSX":
                holder.imageView.setImageResource(R.drawable.powerpoint);
                break;
            case "MSPPSM":
                holder.imageView.setImageResource(R.drawable.powerpoint);
                break;
            case "MSPPAM":
                holder.imageView.setImageResource(R.drawable.powerpoint);
                break;
            case "MSSLDX":
                holder.imageView.setImageResource(R.drawable.powerpoint);
                break;
            case "MSSLDM":
                holder.imageView.setImageResource(R.drawable.powerpoint);
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
            case "PYTHON":
                holder.imageView.setImageResource(R.drawable.py);
                break;
            case "JSON":
                holder.imageView.setImageResource(R.drawable.json);
                break;
            case "XML":
                holder.imageView.setImageResource(R.drawable.xml);
                break;
            case "EXE":
                holder.imageView.setImageResource(R.drawable.exe);
                break;
            case "":
                holder.imageView.setImageResource(R.drawable.documentempty);
                break;
        }

        holder.container.setOnClickListener(v -> onFileSelectListener.onFileSelected(files.get(position)));


    }

    @Override
    public int getItemCount() {
        return files.size();
    }


}
