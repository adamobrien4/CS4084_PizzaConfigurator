package ie.ul.pizzaconfigurator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PizzaOrderScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_order_screen);

        Intent intent = getIntent();
        String pizza_details = intent.getStringExtra("PizzaOrderDetails");

        TextView pizzaOrderDetails = findViewById(R.id.pizza_order_details);
        pizzaOrderDetails.setText(pizza_details);
    }
}
