//
//  HomeVCViewController.swift
//  E-Globes
//
//  Created by God on 22/07/19.
//  Copyright © 2019 vibrantcube. All rights reserved.
//

import UIKit

class HomeVCViewController: UIViewController,UITableViewDelegate, UITableViewDataSource {
    
    

    @IBOutlet weak var tableViewz: UITableView!
    override func viewDidLoad() {
        super.viewDidLoad()
        tableViewz.delegate = self
        tableViewz.dataSource = self
        

        // Do any additional setup after loading the view.
    }
    
    
    func numberOfSections(in tableView: UITableView) -> Int {
        return 2
    }
    
     func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
     
        if section == 0{
            return 1
        }else if section == 1{
                return 8
        }else{
        return 0
        }
    }
    
     func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
    
        if indexPath.section == 0{
            let cell = tableViewz.dequeueReusableCell(withIdentifier: "headerCell", for: indexPath)
            
            
            return cell
        }else if indexPath.section == 1{
            let cell = tableViewz.dequeueReusableCell(withIdentifier: "TrendCell", for: indexPath)
            
            
            return cell
        }else{
            let cell = tableViewz.dequeueReusableCell(withIdentifier: "TrendCell", for: indexPath)
            
            
            return cell
        }
      
       
        
        
    }
    
//    func tableView(_ tableView: UITableView, viewForHeaderInSection section: Int) -> UIView? {
//        let cell = tableViewz.dequeueReusableCell(withIdentifier: "headerCell") as? HomeHeaderTVC
//
//        return cell
//    }
//
//    func tableView(_ tableView: UITableView, heightForHeaderInSection section: Int) -> CGFloat {
//        return 922
//    }
    
    func tableView(_ tableView: UITableView, heightForRowAt indexPath: IndexPath) -> CGFloat {
        if indexPath.section == 0 {
            return 922
        }else if indexPath.section == 1{
            return 175
        }else{
            return 0
        }
    }
    

    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destination.
        // Pass the selected object to the new view controller.
    }
    */

}
