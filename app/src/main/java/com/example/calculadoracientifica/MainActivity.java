package com.example.calculadoracientifica;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button num0,num1,num2,num3,num4,num5,num6,num7,num8,num9,suma,resta,multiplicacion,division,cambio,punto,borrar1,borrarT,porcentaje,sen,cos,tan,log,igual;
    private TextView mostrar;
    String unir,cadena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mostrar = findViewById(R.id.mostrar);//esto ya está obsoleto preguntar como
        num0 = findViewById(R.id.num0);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);
        suma = findViewById(R.id.suma);
        resta = findViewById(R.id.resta);
        multiplicacion = findViewById(R.id.multiplicacion);
        division = findViewById(R.id.division);
        cambio = findViewById(R.id.cambio);
        punto = findViewById(R.id.punto);
        borrar1 = findViewById(R.id.borrar);
        borrarT = findViewById(R.id.borrarT);
        porcentaje = findViewById(R.id.porcentaje);
        igual = findViewById(R.id.igual);
        mostrarTexto();

    }

    void mostrarTexto(){
        num0.setOnClickListener(v-> mostrar.setText(contatenar(0)));
        num1.setOnClickListener(v-> mostrar.setText(contatenar(1)));
        num2.setOnClickListener(v-> mostrar.setText(contatenar(2)));
        num3.setOnClickListener(v-> mostrar.setText(contatenar(3)));
        num4.setOnClickListener(v-> mostrar.setText(contatenar(4)));
        num5.setOnClickListener(v-> mostrar.setText(contatenar(5)));
        num6.setOnClickListener(v-> mostrar.setText(contatenar(6)));
        num7.setOnClickListener(v-> mostrar.setText(contatenar(7)));
        num8.setOnClickListener(v-> mostrar.setText(contatenar(8)));
        num9.setOnClickListener(v-> mostrar.setText(contatenar(9)));
        suma.setOnClickListener(v-> mostrar.setText(suma()));
        resta.setOnClickListener(v->mostrar.setText(resta()));
        multiplicacion.setOnClickListener(v->mostrar.setText(multiplicacion()));
        division.setOnClickListener(v->mostrar.setText(division()));
        //cambio.setOnClickListener(v->intercambioFuncion());
        //raiz.setOnClickListener(v->mostrar.setText(raiz()));
        punto.setOnClickListener(v->mostrar.setText(punto()));
        borrar1.setOnClickListener(v->mostrar.setText(borrar1()));
        borrarT.setOnClickListener(v->mostrar.setText(borrarT()));
        porcentaje.setOnClickListener(v->mostrar.setText(porcentaje()));
        igual.setOnClickListener(v-> igual());

    }

    String contatenar(int op){
        unir = mostrar.getText().toString();
        switch (op){
            case 0:
                unir = unir +"0";
                break;
            case 1:
                unir = unir +"1";
                break;
            case 2:
                unir = unir +"2";
                break;
            case 3:
                unir = unir +"3";
                break;
            case 4:
                unir = unir +"4";
                break;
            case 5:
                unir = unir +"5";
                break;
            case 6:
                unir = unir +"6";
                break;
            case 7:
                unir = unir +"7";
                break;
            case 8:
                unir = unir +"8";
                break;
            case 9:
                unir = unir +"9";
                break;
        }
        return unir;
    }

    String suma(){
        cadena = mostrar.getText().toString();
        cadena += "+";
        return cadena;
    }

    String resta(){
        cadena = mostrar.getText().toString();
        cadena += "-";
        return cadena;
    }

    String multiplicacion() {
        cadena = mostrar.getText().toString();
        cadena += "x";
        return cadena;
    }

    String division() {
        cadena = mostrar.getText().toString();
        cadena += "/";
        return cadena;
    }

    String raiz() {
        cadena = mostrar.getText().toString();
        cadena += "√";
        return cadena;
    }

    String punto() {
        cadena = mostrar.getText().toString();
        cadena += ".";
        return cadena;
    }

    String borrar1() {
        cadena = mostrar.getText().toString();
        String aux ="";
        if(cadena.length() != 0){
            aux = cadena.substring(0,cadena.length()-1);
        }
        return aux;
    }

    String borrarT() {
        cadena = mostrar.getText().toString();
        if(cadena.length() != 0){
            cadena = "";
        }
        return cadena;
    }

    String porcentaje() {
        cadena = mostrar.getText().toString();
        cadena += "%";
        return cadena;
    }

    String seno() {
        cadena = mostrar.getText().toString();
        cadena += "sin(";
        return cadena;
    }

    String coseno() {
        cadena = mostrar.getText().toString();
        cadena += "cos(";
        return cadena;
    }

    String tangente() {
        cadena = mostrar.getText().toString();
        cadena += "tan(";
        return cadena;
    }

    String arcSeno() {
        cadena = mostrar.getText().toString();
        cadena += "arcsen(";
        return cadena;
    }

    String arcCoseno() {
        cadena = mostrar.getText().toString();
        cadena += "arccos(";
        return cadena;
    }

    String arcTangente() {
        cadena = mostrar.getText().toString();
        cadena += "arctan(";
        return cadena;
    }

    String logaritmo() {
        cadena = mostrar.getText().toString();
        cadena += "lg(";
        return cadena;
    }

    void igual(){//necesito dos arrayList una para los numeros y una para los signos
        cadena = mostrar.getText().toString();
        String n1="",n2="";
        String op1="";
        boolean op = false;
        for(int i=0;i<cadena.length();i++){//Ya funciona el punto es para valores de tipo decimal
            if(cadena.charAt(i) == '0' || cadena.charAt(i) == '1' || cadena.charAt(i) == '2' || cadena.charAt(i) == '3' || cadena.charAt(i) == '4' || cadena.charAt(i) == '5' || cadena.charAt(i) == '6' || cadena.charAt(i) == '7' || cadena.charAt(i) == '8' || cadena.charAt(i) == '9' || cadena.charAt(i) == '.'){//error aqui

                if(!op){
                    n1 = n1 + cadena.charAt(i);
                }else{
                    n2 = n2 + cadena.charAt(i);
                }

            }else if(cadena.charAt(i) == '+' || cadena.charAt(i) == '-' || cadena.charAt(i) == 'x' || cadena.charAt(i) == '/' || cadena.charAt(i) == '%'){// en dado caso de que encuentre algún simbolo
                op1 = op1 + cadena.charAt(i);
                op = true;

            }else if(cadena.charAt(i) == 's' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'n'|| cadena.charAt(i) == '('){
                op1 = op1 + cadena.charAt(i);
                op = true;
            }else if(cadena.charAt(i) == 'c' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 's'|| cadena.charAt(i) == '('){
                op1 = op1 + cadena.charAt(i);
                op = true;
            }else if(cadena.charAt(i) == 't' || cadena.charAt(i) == 'a' || cadena.charAt(i) == 'n'|| cadena.charAt(i) == '('){
                op1 = op1 + cadena.charAt(i);
                op = true;
            }else if(cadena.charAt(i) == 'l' || cadena.charAt(i) == 'g' || cadena.charAt(i) == '('){
                op1 = op1 + cadena.charAt(i);
                op = true;
            }else if(cadena.charAt(i) == '√'){
                op1 = op1 + cadena.charAt(i);
                op = true;
            }else if(cadena.charAt(i) == 'a' ||  cadena.charAt(i) == 'r' || cadena.charAt(i) == 'c'||  cadena.charAt(i) == 's' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'n' || cadena.charAt(i) == '('){//arcoseno
                op1 = op1 + cadena.charAt(i);
                op = true;
            }else if(cadena.charAt(i) == 'a' ||  cadena.charAt(i) == 'r' || cadena.charAt(i) == 'c'||  cadena.charAt(i) == 'c' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 's' || cadena.charAt(i) == '('){//arccooseno
                op1 = op1 + cadena.charAt(i);
                op = true;
            }else if(cadena.charAt(i) == 'a' ||  cadena.charAt(i) == 'r' || cadena.charAt(i) == 'c'||  cadena.charAt(i) == 't' || cadena.charAt(i) == 'a' || cadena.charAt(i) == 'n' || cadena.charAt(i) == '('){//arcotan
                op1 = op1 + cadena.charAt(i);
                op = true;
            }
        }
       mostrar.setText(operacion(n1,n2,op1));
    }

    String operacion(String v1, String v2,String op){//mandar un retorno de tipo string ya que la operacion este hecha
        String retorno ="";
        double aux = 0.0f;

        switch (op){
            case "+":
                retorno = String.valueOf(Float.parseFloat(v1) + Float.parseFloat(v2));
                break;
            case "-":
                retorno = String.valueOf(Float.parseFloat(v1) - Float.parseFloat(v2));
                break;
            case "x":
                retorno = String.valueOf(Float.parseFloat(v1) * Float.parseFloat(v2));
                break;
            case "/":
                retorno = String.valueOf(Float.parseFloat(v1) / Float.parseFloat(v2));
                break;
            case "%"://Ya sirve
                retorno = String.valueOf(Float.parseFloat(v1) % Float.parseFloat(v2));
                break;
            case "√"://Ya funciona
                retorno = String.valueOf(Math.sqrt(Float.parseFloat(v2)));
                break;
            case "sin("://ya funciona
                retorno = String.valueOf(Math.sin(cientificfun(v1,v2,aux,op)));
                break;
            case "cos("://ya está bien
                retorno = String.valueOf(Math.cos(cientificfun(v1,v2,aux,op)));
                break;
            case "tan("://ya
                retorno = String.valueOf(Math.tan(cientificfun(v1,v2,aux,op)));
                break;
            case "lg("://Es base 10
                retorno = String.valueOf(Math.log10(Double.parseDouble(v2)));
                break;
            case "arcsen(":
                retorno = String.valueOf(Math.toDegrees(Math.asin(Double.parseDouble(v2))));
                break;
            case "arccos(":
                retorno = String.valueOf(Math.toDegrees(Math.acos(Double.parseDouble(v2))));
                break;
            case "arctan(":
                retorno = String.valueOf(Math.toDegrees(Math.atan(Double.parseDouble(v2))));
                break;
            default:
                Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
        }
        return  retorno;
    }

/*poner la opcion de un boton que cambie las funciones de varios botone
*/

public double cientificfun(String v1, String v2,double aux,String op){

    if(op.equals("sin(") || op.equals("cos(") || op.equals("tan(")) {
        if (v1.length() != 0) {
            aux = Math.toRadians(Double.parseDouble(v1));
        } else if (v2.length() != 0) {
            aux = Math.toRadians(Double.parseDouble(v2));
        }
    }

    return aux;
}

    @SuppressLint("SetTextI18n")
    void intercambioFuncion(){

        if(sen.getText().toString().equals("sen")){
            sen.setText("aSen");
            sen.setOnClickListener(v->mostrar.setText(arcSeno()));
            cos.setText("aCos");
            cos.setOnClickListener(v->mostrar.setText(arcCoseno()));
            tan.setText("aTan");
            tan.setOnClickListener(v->mostrar.setText(arcTangente()));
            log.setText("√");
            log.setOnClickListener(v->mostrar.setText(raiz()));

        }else if(sen.getText().toString().equals("aSen")){
            sen.setText("sen");
            sen.setOnClickListener(v->mostrar.setText(seno()));
            cos.setText("cos");
            cos.setOnClickListener(v->mostrar.setText(coseno()));
            tan.setText("tan");
            tan.setOnClickListener(v->mostrar.setText(tangente()));
            log.setText("log");
            log.setOnClickListener(v->mostrar.setText(logaritmo()));
        }
    }

}