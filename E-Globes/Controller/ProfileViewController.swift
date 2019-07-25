//
//  ProfileViewController.swift
//  E-Globes
//
//  Created by God on 22/07/19.
//  Copyright © 2019 vibrantcube. All rights reserved.
//

import UIKit

class ProfileViewController: UIViewController {

    @IBOutlet weak var googleBtn: UIButton!
    
    @IBOutlet weak var fbBtn: UIButton!
    
    @IBOutlet weak var signInBtn: UIButton!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        googleBtn.layer.cornerRadius = 4.0
        googleBtn.layer.shadowColor = UIColor.gray.cgColor
        googleBtn.layer.shadowOffset = CGSize(width: 0.0, height: 0.0)
        googleBtn.layer.shadowRadius = 12.0
        googleBtn.layer.shadowOpacity = 0.7
        
        fbBtn.layer.cornerRadius = 4.0
        fbBtn.layer.shadowColor = UIColor.gray.cgColor
        fbBtn.layer.shadowOffset = CGSize(width: 0.0, height: 0.0)
        fbBtn.layer.shadowRadius = 12.0
        fbBtn.layer.shadowOpacity = 0.7
        
        
        
        signInBtn.layer.cornerRadius = 4.0
        signInBtn.layer.shadowColor = UIColor.gray.cgColor
        signInBtn.layer.shadowOffset = CGSize(width: 0.0, height: 0.0)
        signInBtn.layer.shadowRadius = 12.0
        signInBtn.layer.shadowOpacity = 0.7
        // Do any additional setup after loading the view.
    }
    

    @IBAction func SignInAction() {
//        let storyboard = UIStoryboard(name: "Main", bundle: nil)
//        let maindriverVC = storyboard.instantiateViewController(withIdentifier: "SignInVC") as! SignInVC
//        self.navigationController?.pushViewController(maindriverVC, animated: true)
        
        
        
//        let vc = UIStoryboard.init(name: "Main", bundle: Bundle.main).instantiateViewController(withIdentifier: "SignInVC") as? SignInVC
//        self.navigationController?.pushViewController(vc!, animated: true)
        
        
        
        
        
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
