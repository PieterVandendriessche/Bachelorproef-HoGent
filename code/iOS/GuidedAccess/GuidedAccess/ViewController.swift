//
//  ViewController.swift
//  GuidedAccess
//
//  Created by Pieter Vandendriessche on 05/05/2019.
//  Copyright © 2019 Pieter Vandendriessche. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var gaOnlineKnop: UIButton!
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        
        print(UIAccessibility.isGuidedAccessEnabled)
        
    }
    
    @objc private func updateViewForGuidedAccess() {
        print("THAT HAPPEND")
    }

    @IBAction func test(_ sender: Any) {
        print(UIAccessibility.isGuidedAccessEnabled)
    }
    
}

