package ie.ul.pizzaconfigurator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private String retrieveOrderDetails() {
        String res = "";

        // Pizza Type Spinner
        res += ((Spinner) findViewById(R.id.pizza_type_spinner)).getSelectedItem().toString() + "\n";

        // Extras
        if (((CheckBox) findViewById(R.id.extra_cheese)).isChecked()) {
            res += "Extra Cheese\n";
        }
        if (((CheckBox) findViewById(R.id.extra_bacon)).isChecked()) {
            res += "Extra Bacon\n";
        }
        if (((CheckBox) findViewById(R.id.extra_sauce)).isChecked()) {
            res += "Extra Sauce\n";
        }

        // Options
        if (((Switch) findViewById(R.id.option_crust)).isChecked()) {
            res += "Stuffed Crust\n";
        }
        if (!((Switch) findViewById(R.id.option_sliced)).isChecked()) {
            res += "Not Sliced\n";
        }
        if (((Switch) findViewById(R.id.option_cutlery)).isChecked()) {
            res += "Included Cutlery";
        }


        return res;
    }

    public void sendPizzaOrder(View view) {
        Intent intent = new Intent(this, PizzaOrderScreen.class);
        intent.putExtra("PizzaOrderDetails", retrieveOrderDetails());
        startActivity(intent);
    }
}
