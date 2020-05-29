package com.udemy.tomandjerry;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean isImageVisible = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void eraseTaJ(View view) {

      if (isImageVisible){
            ImageView taj1ImageView = findViewById(R.id.taj1ImageView);
            taj1ImageView.animate().alpha(0).rotation(taj1ImageView.getRotation() + 3600).scaleY(0).scaleX(0).setDuration(3000);

            ImageView taj2ImageView = findViewById(R.id.taj2ImageView);
            taj2ImageView.animate().alpha(1).rotation(taj2ImageView.getRotation() + 3600).scaleY(1).scaleX(1).setDuration(3000);
            isImageVisible = false;
        } else {
            ImageView taj1ImageView = findViewById(R.id.taj1ImageView);
            taj1ImageView.animate().alpha(1).rotation(taj1ImageView.getRotation() + 3600).scaleY(1).scaleX(1).setDuration(3000);

            ImageView taj2ImageView = findViewById(R.id.taj2ImageView);
            taj2ImageView.animate().alpha(0).rotation(taj2ImageView.getRotation() + 3600).scaleY(0).scaleX(0).setDuration(3000);
            isImageVisible = true;
        }
    }
}
