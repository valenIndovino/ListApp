package com.ort.listapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ort.listapp.R
import com.ort.listapp.data.FamiliaRepository
import com.ort.listapp.domain.model.Familia
import com.ort.listapp.domain.model.Lista
import com.ort.listapp.domain.model.ProductoListado
import com.ort.listapp.domain.model.TipoLista

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavView: BottomNavigationView
    private lateinit var navHostFragment: NavHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment
        bottomNavView = findViewById(R.id.bottomNavigationView)
        NavigationUI.setupWithNavController(bottomNavView, navHostFragment.navController)


        val familiaRepository = FamiliaRepository()

        val familia = Familia(
            id = "familiaId",
            nombre = "Los Argento",
            listas = arrayListOf(
                Lista(
                    id = "listaDePrueba",
                    nombre = "Lista 1: Familia García",
                    fechaCreacion = "hoy",
                    tipoLista = TipoLista.LISTA_DE_COMPRAS,
                    productos = mutableListOf(
                        ProductoListado(8, "Valentino", "0000075024956"),
                        ProductoListado(2, "Candela", "7790742656018"),
                    )
                ),
                Lista(
                    id = "listaDePrueba",
                    nombre = "Lista 1: Familia García",
                    fechaCreacion = "hoy",
                    tipoLista = TipoLista.ALACENA_VIRTUAL,
                    productos = mutableListOf(
                        ProductoListado(1, "Rafael", "7790895007057"),
                        ProductoListado(3, "Martin", "5410171921991"),
                    )
                )
            ),
            productosFavoritos = arrayListOf(
                "0080432400432",
                "7790895007057",
//                "7790742656018",
//                "0000077900319"
            ),
//            productosPersonalizados = arrayListOf(
//                Producto(
//                    "5410171921991",
//                    "01",
//                    "0108",
//                    "MC CAIN",
//                    "Croquetas de Papas Noisettes Mc Cain 1 Kg",
//                    978.0,
//                    997.0,
//                    "1.0 kg"
//                ),
//                Producto(
//                    "0040000017318",
//                    "02",
//                    "0208",
//                    "M&M",
//                    "Confites de Chocolate M&M 150 Gr",
//                    1010.0,
//                    1047.99,
//                    "150.0 gr"
//                ),
//                Producto(
//                    "7790250047162",
//                    "03",
//                    "0302",
//                    "BABYSEC",
//                    "Pañal G Babysec Premium 1 U",
//                    865.65,
//                    865.65,
//                    "1.0 un"
//                ),
//            )
        )

//        runBlocking {
//            withContext(Dispatchers.Default) {
//                familiaRepository.guardarFamilia(familia)
//            }
//        }

    }
}



