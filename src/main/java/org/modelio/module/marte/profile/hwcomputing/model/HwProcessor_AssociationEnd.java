package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("057f2681-336f-4409-9fbf-f620752d0d27")
public class HwProcessor_AssociationEnd extends HwComputingResource_AssociationEnd {
    @objid ("277dd1f0-dba4-473c-9125-23a7cf657ced")
    public HwProcessor_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPROCESSOR_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("HwProcessor_AssociationEnd"));
    }

    @objid ("8599bfac-aa2b-4a14-9d95-5c3f4153a2b9")
    public HwProcessor_AssociationEnd(AssociationEnd element) {
        super(element);
    }

    @objid ("409880bb-be6f-4f47-acb7-b0ca741c5665")
    public String getarchitecture() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_ARCHITECTURE, this.element);
    }

    @objid ("bccc5759-2e33-42d0-8499-048bad483152")
    public void setarchitecture(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_ARCHITECTURE, value);
    }

    @objid ("a314a5a5-92be-4357-b014-ae83c525e62f")
    public String getmips() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_MIPS, this.element);
    }

    @objid ("d33852f0-4315-4e7f-816f-eb651076d2bb")
    public void setmips(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_MIPS, value);
    }

    @objid ("276500c1-7b6a-41a3-856e-abfbaa3968ad")
    public String getipc() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_IPC, this.element);
    }

    @objid ("d555c8d2-9157-44fe-8cbb-a12bc2d0425c")
    public void setipc(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_IPC, value);
    }

    @objid ("088004e6-0f30-4acd-8467-e38854e28a9e")
    public String getnbCores() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBCORES, this.element);
    }

    @objid ("5a26c402-11c9-4008-bacd-3ed37b948f06")
    public void setnbCores(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBCORES, value);
    }

    @objid ("e382771b-7273-4619-9d57-0d3759651824")
    public String getnbPipelines() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBPIPELINES, this.element);
    }

    @objid ("3aa099f3-6395-4645-a9bd-26c944e39105")
    public void setnbPipelines(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBPIPELINES, value);
    }

    @objid ("34545876-f580-44dc-8082-e94a1beb1c05")
    public String getnbStages() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBSTAGES, this.element);
    }

    @objid ("53b88261-dbce-4d7b-aaca-373d0fab89a9")
    public void setnbStages(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBSTAGES, value);
    }

    @objid ("dec75a2b-c439-4db3-9575-d10f08c72cb6")
    public String getnbALUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBALUS, this.element);
    }

    @objid ("da0a68f0-b82d-42c9-a869-1e128148b731")
    public void setnbALUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBALUS, value);
    }

    @objid ("4383f983-75ee-4aca-a501-78a8de71c723")
    public String getnbFPUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBFPUS, this.element);
    }

    @objid ("8ac4353e-2dd0-468f-a063-e92e9f7beaea")
    public void setnbFPUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBFPUS, value);
    }

    @objid ("269cd584-0af6-4e91-b470-b59cf02f2dd2")
    public String getownedISAs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_OWNEDISAS, this.element);
    }

    @objid ("1010410c-47eb-4d88-8b99-fb6fa39ecca6")
    public void setownedISAs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_OWNEDISAS, value);
    }

    @objid ("9ce3ba06-4c88-4a9e-beb5-8515b9580029")
    public String getpredictors() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_PREDICTORS, this.element);
    }

    @objid ("0dfba414-e263-4506-9bab-9bb935123f81")
    public void setpredictors(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_PREDICTORS, value);
    }

    @objid ("a2426f03-275a-49bd-90de-9ca0da2ba30a")
    public String getcaches() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_CACHES, this.element);
    }

    @objid ("c20da5b9-4524-4ff9-b065-905d548b6568")
    public void setcaches(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_CACHES, value);
    }

    @objid ("27bfc65f-8b8e-4229-8ea1-1e0c6912c3b7")
    public String getownedMMUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_OWNEDMMUS, this.element);
    }

    @objid ("57bd698f-0735-479e-a212-f9a8af10d69b")
    public void setownedMMUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_OWNEDMMUS, value);
    }

}
