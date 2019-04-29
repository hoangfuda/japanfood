package giavu.co.jp.di

import giavu.co.jp.activity.login.LoginViewModel
import giavu.co.jp.activity.profile.ProfileViewModel
import giavu.co.jp.activity.quotelist.QuoteListViewModel
import giavu.co.jp.activity.register.RegisterViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.Module

/**
 * @Author: Hoang Vu
 * @Date:   2019/01/04
 */
class ViewModelModule {

    val module: Module = org.koin.dsl.module.module {
        viewModel { LoginViewModel(userApi = get(), userSharePreference = get()) }
        viewModel { ProfileViewModel(userApi = get()) }
        viewModel { RegisterViewModel(resourceProvider = get(), userApi = get(), userSharePreference = get()) }
        viewModel { QuoteListViewModel(application = androidApplication()) }
    }
}
