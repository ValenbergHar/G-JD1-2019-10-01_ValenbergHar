# The ProductEntity Datbase

This project is android application for most popular productEntities information.
The application contain two screens:
  - productEntities List
  - Details for each productEntity.

The application get the content from the [The ProductEntity DB API](https://www.themoviedb.org/documentation/api), display it and store it on the device for work in offline mode.

The application support phone and tablet by using fragments. In phone the fragment change by click on some item in the list. In tablet they display side by side, and the details fragment change the content by item click.


#Architecture:
The application develop base MVVM design pattern as described below:
![alt text](https://cdn-images-1.medium.com/max/960/1*Tt_OwtZJ993YzswuRyPQiA.png)


# Tecnolegis:
Android Architecture Components:
  - Paging library - helps the app observe and display a reasonable subset of productEntities.
  - ViewModel - Save the activity/fragment state across configuration changes.
  - LiveData - For connect the DB and network layers with the view.
  - MediatorLiveData - marge the LiveData from the network and the DB.

Room Persistence Library - The application store productEntities content for display it in offline mode.

Data Binding Library - Bind UI components in details layouts to data sources in details fragment using a declarative format.

Retrofit2:
  - The application get the content by http request using OkHttp3.
  - Parse the response via JsonDeserializer.
  - Create data objects via Gson.
  - Allow to debug the response via Logging-interceptor (okhttp).

Picasso - For loading and caching images.

RecyclerView  - Display the productEntities list in effectively.

Parcelable - for transfer the objects between components.

Reactivex - Use the observable pattern for display indicatation when application loading content. 


License
----

MIT

**Free Software, Hell Yeah!**

