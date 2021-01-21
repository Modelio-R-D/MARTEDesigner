package org.modelio.module.marte.profile.grm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Text;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.BodyTreePage;
import org.modelio.module.marte.profile.editors.TransformationDialog;
import org.modelio.module.marte.profile.nfps.model.ComplexTree_NFP_DataTxRate;
import org.modelio.module.marte.profile.nfps.model.ComplexTree_NFP_Duration;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("5679a7a1-d9e8-4b90-857c-9755fc3a6496")
public class CommunicationMedia_BodyTreePage extends BodyTreePage {
    @objid ("7f257921-6dea-4218-9829-515442663ce4")
    private ComplexTree_NFP_DataTxRate complex_capacity;

    @objid ("790b923b-dc5a-40a8-9a74-e8cc49a93ccd")
    private ComplexTree_NFP_Duration complex_blockT;

    @objid ("2f7c3757-2b63-4aaa-9685-980c650c0beb")
    private ComplexTree_NFP_Duration complex_packetT;

    @objid ("4c1a7162-fba6-406d-8d09-c40357b35912")
    private Text resMult;

    @objid ("bc3f08f4-3164-4d92-9baa-bd211e90ff9b")
    private Button isProtected;

    @objid ("848995de-cc73-4589-837b-535201a0ce52")
    private Button isActive;

    @objid ("38ec9c10-a16b-4f8a-bb6f-070dc0c0ed4d")
    private Text elementSize;

    @objid ("c64c92ad-7858-4ebf-86bb-bad00ac735d3")
    private Combo transmMode;

    @objid ("cada4201-0574-4b9b-a7ca-6d252181faaa")
    private Text speedFactor;

    @objid ("baa4f21f-f049-4f54-bded-83cddba7f668")
    private Combo mainScheduler;

    @objid ("812455c6-07c0-4f87-8746-d336083db270")
    public CommunicationMedia_BodyTreePage(TransformationDialog dialog, ModelElement element) {
        /*
         * the tag types List<MObject> names has to be created here.
         */
        String[] listTagTypes = new String[] {
                MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_RESMULT,
                MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_ISPROTECTED,
                MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_ISACTIVE,
                MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_ELEMENTSIZE,
                MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_TRANSMMODE,
                MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_BLOCKT,
                MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_PACKETT,
                MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_CAPACITY,
                MARTEDesignerTagTypes.PROCESSINGRESOURCE_CLASSIFIER_PROCESSINGRESOURCE_CLASSIFIER_SPEEDFACTOR,
                MARTEDesignerTagTypes.PROCESSINGRESOURCE_CLASSIFIER_PROCESSINGRESOURCE_CLASSIFIER_MAINSCHEDULER
        };
        
        /*
         * the tag type descriptions List<MObject> has to be created here also.
         */
        String[] listDescriptions = new String[] {
                "Indicates the multiplicity of a resource. For a classifier it may specifiy the maximum of instances of\n" +
                "the resource considered as available. By default only one instance is available.",
        
                "It true it indicates that the access to the resource is protected by some kind of brokeringResource.",     
        
                "It true it indicates that the resource has an initial behavior associated that allows it possibly\n"+
                "perform its services autonomously or by the triggering and animation of behaviors on others.",
        
                "Characterizes the size of the elements to be transmitted." ,  
        
                "Defines the transmission mode, one the following values : simplex, half-simplex or full-duplex.",
        
                "Time the communicationMedia is blocked and cannot transmit due to the transmission of one\n" +
                "communication quantum.",
        
                "Time to transmit the element used as a communication quantum, usually called a packet, the size in\n"+
                "bits of this quantum is described by the attribute elementSize.",          
        
                "Capacity of the communication element when applicable link.",  
        
                "Is a relative factor for annotating the processing speed expressed as a ratio to the speed of the\n"+
                "reference processingResource for the system under consideration.",
        
                "Is the scheduler that controls the access to its processing capacity."
        };
        
        /*
         * the init function has to call in the CommunicationMedia_BodyTreePage constructor.
         */
        init(dialog, element, listTagTypes, listDescriptions);
        
        /*
         * the listener is created here.
         */
        new ListenerCommunicationMedia_BTP(dialog, this, this.element);
    }

    @objid ("fc82f349-4cff-4981-86db-af85032e1347")
    public String getElementSize() {
        return getDataSingleValueInteger(elementSize);
    }

    @objid ("795541e8-4213-40d8-ab0e-5268ba2ba2dd")
    public String getResMult() {
        return getDataSingleValueInteger(resMult);
    }

    @objid ("040edf7b-49c1-4620-94f1-71fb3c209af1")
    public boolean getIsProtected() {
        return getDataBoolean(isProtected);
    }

    @objid ("18976bdf-2c57-4056-a274-2bfcc4aff886")
    public boolean getIsActive() {
        return getDataBoolean(isActive);
    }

    @objid ("28efb888-ec59-4c83-be3a-b2a542ce08e3")
    public String getTransmMode() {
        return getDataSingleElt(transmMode);
    }

    @objid ("7bfa97c9-e400-409e-8a88-e289dafeeea5")
    public String[] getBlockT() {
        return getDataComplex(complex_blockT.getListEditor());
    }

    @objid ("77c6d990-c7ef-4107-8605-6fa0efb65f6c")
    public String[] getPacketT() {
        return getDataComplex(complex_packetT.getListEditor());
    }

    @objid ("bd6f925b-cb2c-42e9-a317-c10ac42f64b3")
    public String[] getCapacity() {
        return getDataComplex(complex_capacity.getListEditor());
    }

    @objid ("f161fa30-de86-43da-91c3-d7624d69fab4")
    public String getSpeedFactor() {
        return getDataSingleValue(speedFactor);
    }

    @objid ("72a488c9-e6bd-45ec-afa0-2a9bc3895ff0")
    public String getMainScheduler() {
        return getDataSingleElt(mainScheduler);
    }

    @objid ("b928ca4a-31b8-4890-9473-aafce034ba8e")
    public void buildTabFolder() {
        // elements getting
        isProtected  = setCompositeBoolean(getListTagTypes()[1], getListDescriptions()[1], 1);
        updateBoolean(isProtected, getListTagTypes()[1], this.element);
        
        isActive = setCompositeBoolean(getListTagTypes()[2], getListDescriptions()[2], 2); 
        updateBoolean(isActive, getListTagTypes()[2], this.element);
        
        
        elementSize = setCompositeSingleVal(getListTagTypes()[3], getListDescriptions()[3], 3);
        updateSingleValue(elementSize, getListTagTypes()[3], this.element);
         
        String[] transmModeKinds = new String[]{"simplex", "half-duplex", "full-duplex"};
        transmMode = setCompositeSingleKind(getListTagTypes()[4], getListDescriptions()[4], 4);
        updateSingleKind(transmMode, getListTagTypes()[4], element, transmModeKinds);
        
        complex_blockT = new ComplexTree_NFP_Duration(getListTagTypes()[5]);
        setCompositeComplex(getListTagTypes()[5], getListDescriptions()[5], 5, complex_blockT);
        complex_blockT.update(complex_blockT, getListTagTypes()[5], this.element);
        
        complex_packetT = new ComplexTree_NFP_Duration(getListTagTypes()[6]);
        setCompositeComplex(getListTagTypes()[6], getListDescriptions()[6], 6, complex_packetT);
        complex_packetT.update(complex_packetT, getListTagTypes()[6], this.element);
        
        complex_capacity = new ComplexTree_NFP_DataTxRate(getListTagTypes()[7]);
        setCompositeComplex(getListTagTypes()[7], getListDescriptions()[7], 7, complex_capacity);
        complex_capacity.update(complex_capacity, getListTagTypes()[7], this.element);
        
        speedFactor = setCompositeSingleVal(getListTagTypes()[8], getListDescriptions()[8], 8);
        updateSingleValue(speedFactor, getListTagTypes()[8], this.element);
        
        mainScheduler = setCompositeSingleElt(getListTagTypes()[9], getListDescriptions()[9], 9);
        updateSingleElement(mainScheduler, getListTagTypes()[9], element, ModelUtils.searchElement(Classifier.class, MARTEDesignerStereotypes.SCHEDULER_CLASSIFIER), MARTEDesignerStereotypes.PROFILEASSOCIATION_MAINSCHEDULER_PROCESSINGRESOURCE_SCHEDULER);
        
        resMult = setCompositeSingleVal(getListTagTypes()[0], getListDescriptions()[0], 0);
        updateSingleValue(resMult, getListTagTypes()[0], this.element);
    }

}
