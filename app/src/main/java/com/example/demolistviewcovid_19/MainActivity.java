package com.example.demolistviewcovid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // ListView nay co 3 buoc lam
    ListView listView;
    List<CovidModel> listCovid = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Buoc 1: tao du lieu
        intData();
        // Buoc 2: tao Adapter khong phu thuoc vao Adapter co san
        ArrAdapterCovid adapterCovid = new ArrAdapterCovid(listCovid, this);
        // Buoc 3: tao Listview va set Adapter vao ListView
        listView = (ListView) findViewById(R.id.listViewCovid19);
        listView.setAdapter(adapterCovid);
    }

    // Day la du lieu fix cung
    // Confirmed: so nguoi nhiem benh
    // Recoverd: so nguoi phuc hoi
    // Deaths: so nguoi tu vong
    public void intData() {
        listCovid.add(new CovidModel(R.drawable.us, "United States", "Confirmed: 560,433",
                "Recoverd: 32,634", "Deaths: 22,115"));
        listCovid.add(new CovidModel(R.drawable.spain, "Spain", "Confirmed: 166,831",
                "Recoverd: 62,391", "Deaths: 17,209"));
        listCovid.add(new CovidModel(R.drawable.italy, "Italy", "Confirmed: 156,363",
                "Recoverd: 34,211", "Deaths: 19,899"));
        listCovid.add(new CovidModel(R.drawable.france, "France", "Confirmed: 132,591",
                "Recoverd: 27,816", "Deaths: 14,393"));
        listCovid.add(new CovidModel(R.drawable.germany, "Germany", "Confirmed: 127,854",
                "Recoverd: 64,300", "Deaths: 3,002"));
        listCovid.add(new CovidModel(R.drawable.uk, "United Kingdom", "Confirmed: 84,279",
                "Recoverd: N/A", "Deaths: 10,612"));
        listCovid.add(new CovidModel(R.drawable.china, "China", "Confirmed: 82,160",
                "Recoverd: 77.663", "Deaths: 3,341"));
        listCovid.add(new CovidModel(R.drawable.iran, "Iran", "Confirmed: 71,686",
                "Recoverd: 43,894", "Deaths: 4,474"));
        listCovid.add(new CovidModel(R.drawable.turkey, "Turkey", "Confirmed: 56,956",
                "Recoverd: 3,446", "Deaths: 1,198"));
        listCovid.add(new CovidModel(R.drawable.belgium, "Belgium", "Confirmed: 30,589",
                "Recoverd: 6,707", "Deaths: 3,903"));
        listCovid.add(new CovidModel(R.drawable.netherlands, "Netherlands", "Confirmed: 25,587",
                "Recoverd: 250", "Deaths: 2,737"));
        listCovid.add(new CovidModel(R.drawable.switzerland, "Switzerland", "Confirmed: 25,449",
                "Recoverd: 12,700", "Deaths: 1,115"));
        listCovid.add(new CovidModel(R.drawable.canada, "Canada", "Confirmed: 24,383",
                "Recoverd: 7,172", "Deaths: 717"));
        listCovid.add(new CovidModel(R.drawable.brazil, "Brazil", "Confirmed: 22,318",
                "Recoverd: 173", "Deaths: 1,230"));
        listCovid.add(new CovidModel(R.drawable.russia, "Russia", "Confirmed: 18,328",
                "Recoverd: 1,470", "Deaths: 148"));
        listCovid.add(new CovidModel(R.drawable.portugal, "Portugal", "Confirmed: 16,585",
                "Recoverd: 277", "Deaths: 504"));
        listCovid.add(new CovidModel(R.drawable.austria, "Austria", "Confirmed: 13,974",
                "Recoverd: 7,343", "Deaths: 368"));
        listCovid.add(new CovidModel(R.drawable.israel, "Israel", "Confirmed: 11,235",
                "Recoverd: 1,689", "Deaths: 110"));
        listCovid.add(new CovidModel(R.drawable.southkorea, "South Korea", "Confirmed: 10,537",
                "Recoverd: 7,447", "Deaths: 217"));
        listCovid.add(new CovidModel(R.drawable.sweden, "Sweden", "Confirmed: 10,483",
                "Recoverd: 381", "Deaths: 899"));
        listCovid.add(new CovidModel(R.drawable.ireland, "Ireland", "Confirmed: 9,655",
                "Recoverd: 25", "Deaths: 334"));
    }

}
