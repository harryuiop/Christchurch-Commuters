//package com.example.busapp.datastore
//
//import android.content.Context
//import androidx.datastore.core.DataStore
//import androidx.datastore.preferences.core.Preferences
//import androidx.datastore.preferences.core.stringPreferencesKey
//import androidx.datastore.preferences.preferencesDataStore
//import com.example.busapp.models.AppData
//import com.example.busapp.models.BusStop
//import com.example.busapp.viewmodels.AddBusStopViewModel
//import com.example.busapp.viewmodels.BusStopViewModel
//import com.google.gson.Gson
//import com.google.gson.reflect.TypeToken
//import kotlinx.coroutines.FlowPreview
//import org.koin.android.ext.koin.androidContext
//import org.koin.androidx.viewmodel.dsl.viewModel
//import org.koin.core.scope.get
//import org.koin.dsl.module
//
//private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "stop_data")
//
//@FlowPreview
//val stopAccessModule = module {
//    single<Storage<BusStop>> {
//        PersistentStorage(
//            gson = get(),
//            type = object: TypeToken<List<BusStop>>(){}.type,
//            preferenceKey = stringPreferencesKey("busstop"),
//            dataStore = androidContext().dataStore
//        )
//    }
//
//    single { Gson() }
//
//    viewModel {
//        BusStopViewModel(
//            busStopStorage = get()
//        )
//    }
//
//    viewModel{
//        AddBusStopViewModel()
//    }
//
//}