package org.modelio.module.marte.profile.grm.propertys;

import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.TransformationDialog;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class ListenerCommunicationMedia_BTP extends MouseAdapter {
    private CommunicationMedia_BodyTreePage body;

    private ModelElement element;

    public ListenerCommunicationMedia_BTP(TransformationDialog dialog, CommunicationMedia_BodyTreePage body, ModelElement element) {
        this.body = body;
        this.element = element;
        dialog.getFinishButton().addMouseListener(this);
    }

    public void mouseUp(MouseEvent e) {
        if (this.body.getResMult() != null) {
            ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_RESMULT, this.body.getResMult());
        }
        
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_ISPROTECTED, this.body.getIsProtected());
        
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_ISACTIVE, this.body.getIsActive());
        
        if (this.body.getElementSize() != null) {
            ModelUtils.addStringValue( this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_ELEMENTSIZE, this.body.getElementSize());
        }
        
        ModelUtils.addStringValue( this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_TRANSMMODE, this.body.getTransmMode());
        
        ModelUtils.addMultipleStringValue( this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_BLOCKT, this.body.getBlockT());
        
        ModelUtils.addMultipleStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_PACKETT, this.body.getPacketT());
        
        ModelUtils.addMultipleStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_CAPACITY, this.body.getCapacity());
        
        //LinkManager.removeAllLinks(element, MARTEDesignerStereotypes.PROFILEASSOCIATION_MAINSCHEDULER_PROCESSINGRESOURCE_SCHEDULER);
        
        //for (String s : body.getCapacity()) {
            //Classifier cap = (Classifier)ModelUtils.searchElement(Classifier.class, MARTEDesignerStereotypes.SCHEDULER_CLASSIFIER).getElementOfName(s);
            //LinkManager.addLink(element, cap, MARTEDesignerStereotypes.PROFILEASSOCIATION_MAINSCHEDULER_PROCESSINGRESOURCE_SCHEDULER);
               // }
        
        if (this.body.getSpeedFactor() != null) {
            ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PROCESSINGRESOURCE_CLASSIFIER_PROCESSINGRESOURCE_CLASSIFIER_SPEEDFACTOR, this.body.getSpeedFactor());
        }
        
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PROCESSINGRESOURCE_CLASSIFIER_PROCESSINGRESOURCE_CLASSIFIER_MAINSCHEDULER, this.body.getMainScheduler());
        
        if (!this.body.getMainScheduler().equals("")) {
            Classifier mainScheduler = (Classifier)ModelUtils.searchElement(Classifier.class, MARTEDesignerStereotypes.SCHEDULER_CLASSIFIER).getElementOfName(this.body.getMainScheduler());
            LinkManager.setLink(this.element, mainScheduler, MARTEDesignerStereotypes.PROFILEASSOCIATION_MAINSCHEDULER_PROCESSINGRESOURCE_SCHEDULER);
        }
        else {
            LinkManager.removeLink(this.element, MARTEDesignerStereotypes.PROFILEASSOCIATION_MAINSCHEDULER_PROCESSINGRESOURCE_SCHEDULER);
        }
        this.body.getDialog().dispose();
    }

}
