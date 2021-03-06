package com.kepler.androidsamplemynewsapi.presenters;

import com.kepler.androidsamplemynewsapi.boilers.MVP;
import com.kepler.androidsamplemynewsapi.pojo.Article;
import com.kepler.androidsamplemynewsapi.pojo.Source;

import java.util.List;

public class AppLogic {

    private interface RequiredBaseView extends MVP.BaseView {
    }

    /********* Logic for Main************/
    public interface MainView extends RequiredBaseView {
        void startProgressing();

        void stopProgressing();

        void showNoSourcesData();

        void showLoadingSourcesError();

        void showSources(List<Source> sources);

        boolean isNetworkAvailable();

        void showArticles(List<Article> list, String source);
    }

    public interface MainLogic extends MVP.BasePresenter<MainView> {
        void loadSource();

        void loadArticle(String source);
    }
}
