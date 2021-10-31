package rob.myappcompany.sectionrecyclerview_groupedrecyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    List<Section> sectionList = new ArrayList<>();


    RecyclerView mainRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainRecyclerView = findViewById(R.id.mainRecyclerView);

        MainRecyclerAdapter mainRecyclerAdapter = new MainRecyclerAdapter(sectionList);
        mainRecyclerView.setAdapter(mainRecyclerAdapter);

        mainRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));


        initData();

    }

    private void initData(){
        String sectionOneName = "Action";
        List<String> sectionOneItems = new ArrayList<>();
        sectionOneItems.add("captain America");
        sectionOneItems.add("Iron man");

        String sectionTwoName = "Advanture";
        List<String> sectionTwoItems = new ArrayList<>();
        sectionTwoItems.add("Pirates of the caribbean");
        sectionTwoItems.add("King Kong");
        sectionTwoItems.add("Life of Pie");

        String sectionThreeName = "Epic";
        List<String> sectionThreeItems = new ArrayList<>();
        sectionThreeItems.add("Titanc");
        sectionThreeItems.add("Titanc 2");
        sectionThreeItems.add("Titanc 3");

        String sectionFourName = "war";
        List<String> sectionFourItems = new ArrayList<>();
        sectionFourItems.add("saving Private Ryan");
        sectionFourItems.add("1917");
        sectionFourItems.add("Valkyrie");



        sectionList.add(new Section(sectionOneName, sectionOneItems));
        sectionList.add(new Section(sectionTwoName, sectionTwoItems));
        sectionList.add(new Section(sectionThreeName, sectionThreeItems));
        sectionList.add(new Section(sectionFourName, sectionFourItems));

        Log.i(TAG, "initData: " + sectionList);
    }
}