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
        res += (((CheckBox) findViewById(R.id.extra_cheese)).isChecked()) ? "Extra Cheese\n" : "No Extra Cheese\n";
        res += (((CheckBox) findViewById(R.id.extra_bacon)).isChecked()) ? "Extra Bacon\n" : "No Extra Bacon\n";
        res += (((CheckBox) findViewById(R.id.extra_sauce)).isChecked()) ? "Extra Sauce\n" : "No Extra Sauce\n";
        // Options
        res += (((Switch) findViewById(R.id.option_sliced)).isChecked()) ? "Sliced Pizza\n" : "Not Sliced Pizza\n";
        res += (((Switch) findViewById(R.id.option_crust)).isChecked()) ? "Stuffed Crust\n" : "No Stuffed Crust\n";
        res += (((Switch) findViewById(R.id.option_cutlery)).isChecked()) ? "Cutlery Included\n" : "No Cutlery Included\n";

        return res;
    }

    public void sendPizzaOrder(View view) {
        Intent intent = new Intent(this, PizzaOrderScreen.class);
        intent.putExtra("PizzaOrderDetails", retrieveOrderDetails());
        startActivity(intent);
    }
}
