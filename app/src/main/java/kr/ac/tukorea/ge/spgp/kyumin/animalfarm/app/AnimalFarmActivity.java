package kr.ac.tukorea.ge.spgp.kyumin.animalfarm.app;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import kr.ac.tukorea.ge.spgp.kyumin.animalfarm.R;
import kr.ac.tukorea.ge.spgp.kyumin.framework.activity.GameActivity;
import kr.ac.tukorea.ge.spgp.kyumin.framework.scene.Scene;

public class AnimalFarmActivity extends GameActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Scene().push();
    }
}