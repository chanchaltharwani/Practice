package com.example.practice.navsidedrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentTransaction
import com.example.practice.R
import com.example.practice.databinding.ActivityNavDrawerBinding
import com.example.practice.fragment.*

class NavDrawerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNavDrawerBinding
    // variable for call the default fragmment
    lateinit var homefragment: HomeNavFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_nav_drawer)

        //step 6   toolbar set karne k liye  setSupportActionBar lgate hai
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val drawerToggle: ActionBarDrawerToggle = object : ActionBarDrawerToggle(
            this,    //context
            binding.drawerLayout,  //drawer layout id
            binding.toolbar,   // toolbar
            R.string.drawer_open,   //string
            R.string.drawer_close           //string
        ) {
            //
            override fun onDrawerClosed(drawerView: View) {
                super.onDrawerClosed(drawerView)
                setTitle(R.string.app_name)
            }

            override fun onDrawerOpened(drawerView: View) {
                super.onDrawerOpened(drawerView)
                setTitle(R.string.drawer_close)
            }
        }
        //set default fragment
        homefragment = HomeNavFragment()
        supportFragmentManager.beginTransaction().replace(R.id.framelayout, homefragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()
        drawerToggle.isDrawerIndicatorEnabled = true
        binding.drawerLayout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()


        //navigation view
        binding.navigationview.setNavigationItemSelectedListener { item: MenuItem ->
            when (item.itemId) {
                R.id.home -> {
                    loadHome(HomeNavFragment())
                    true
                }
                R.id.profile -> {
                    loadprofile(ProfileNavFragment())
                    true
                }
                R.id.service -> {
                    loadservice(MyServicesNavFragment())
                    true
                }
                R.id.schedule -> {
                    loadschedule(ScheduleNavFragment())
                    true
                }
                R.id.workout -> {
                    loadworkout(WorkoutNavFragnent())
                    true
                }
                R.id.mealplan -> {
                    mealplan(MealPlanNavFragment())
                    true
                }

                R.id.Fitnesslog -> {
                    fitnesslog(FitnessLogNavFragment())
                    true
                }
                R.id.referfriends -> {
                    referFriend(ReferFriendsNavFragment())
                    true
                }
                R.id.feedback -> {
                    feedback(FeedbackNavFragment())
                    true
                }
                R.id.branch -> {
                    branches(BranchesFragment())
                    true
                }
                R.id.support -> {
                    support(SupportNavFragment())
                    true
                }
                R.id.reportbug -> {
                    reportAbug(ReportABugNavFragment())
                    true
                }
                R.id.terms -> {
                    terms(TermsAndConditionNavFragment())
                    true
                }
                R.id.about -> {
                    about(AboutNavFragment())
                    true
                }
                R.id.logout -> {
                    logout(LogoutNavFragment())
                    true
                }


                else -> {
                    true
                }

            }
            binding.drawerLayout.closeDrawer(GravityCompat.START)
            true

        }
    }


    //step 7 fragment function
    fun loadHome(frag1: HomeNavFragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.framelayout, frag1)
        ft.commit()
    }

    fun loadprofile(frag2: ProfileNavFragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.framelayout, frag2)
        ft.commit()

    }

    fun loadInbox(frag3: InboxNavFragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.framelayout, frag3)
        ft.commit()

    }

    fun loadservice(frag4: MyServicesNavFragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.framelayout, frag4)
        ft.commit()
    }

    fun loadschedule(frag5: ScheduleNavFragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.framelayout, frag5)
        ft.commit()
    }

    fun loadworkout(frag6: WorkoutNavFragnent) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.framelayout, frag6)
        ft.commit()
    }

    fun mealplan(frag7: MealPlanNavFragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.framelayout, frag7)
        ft.commit()
    }

    fun fitnesslog(frag8: FitnessLogNavFragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.framelayout, frag8)
        ft.commit()
    }

    fun referFriend(frag9: ReferFriendsNavFragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.framelayout, frag9)
        ft.commit()
    }

    fun feedback(frag10: FeedbackNavFragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.framelayout, frag10)
        ft.commit()
    }

    fun branches(frag11: BranchesFragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.framelayout, frag11)
        ft.commit()
    }

    fun support(frag12: SupportNavFragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.framelayout, frag12)
        ft.commit()
    }

    fun reportAbug(frag13: ReportABugNavFragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.framelayout, frag13)
        ft.commit()
    }

    fun terms(frag14: TermsAndConditionNavFragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.framelayout, frag14)
        ft.commit()
    }

    fun about(frag15: AboutNavFragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.framelayout, frag15)
        ft.commit()
    }

    fun logout(frag16: LogoutNavFragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.framelayout, frag16)
        ft.commit()
    }


}