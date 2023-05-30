package com.example.uts_akb_10120138.base;

//30 Mei 2023, 10120138, Falentinus kebubun, IF4
public interface IPresenter<T extends IView, IView> {
    void onAttach(T view);
    void onDetach();
}
