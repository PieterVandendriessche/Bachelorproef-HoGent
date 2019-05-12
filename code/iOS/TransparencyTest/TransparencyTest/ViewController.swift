//
//  ViewController.swift
//  TransparencyTest
//
//  Created by Pieter Vandendriessche on 01/05/2019.
//  Copyright © 2019 Pieter Vandendriessche. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var imgViewBlur: UIImageView!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        
        print(UIAccessibility.isMonoAudioEnabled)
    
    }


}

