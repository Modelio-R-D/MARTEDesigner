package org.modelio.module.marte.profile.sw_concurrency.model;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sw_resourcecore.model.SwResource_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("aabcb5c9-ee71-4366-9209-1362868ba227")
public class SwConcurrentResource_Node extends SwResource_Node {
    @objid ("941463f4-d95a-42d9-95df-ab058c38efab")
    protected Node element;

    @objid ("df76bd30-2174-4846-b642-9205b4c8b162")
    public SwConcurrentResource_Node() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWCONCURRENTRESOURCE_CLASSIFIER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SWCONCURRENTRESOURCE_CLASSIFIER));
    }

    @objid ("163c0915-c198-4dbd-8273-8c31a924a1fa")
    public SwConcurrentResource_Node(Node element) {
        this.element = element;
    }

    @objid ("a4212ef6-310e-4950-835d-72d5fed96fde")
    public Node getElement() {
        return this.element;
    }

    @objid ("992c0a74-8585-4749-a704-ed347aeb4709")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("d4367a33-c327-4bab-9d63-0fb10b230ade")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("e4ba841f-c5d1-493b-84eb-291bb40fe703")
    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_TYPE, this.element);
    }

    @objid ("cf6e4425-645b-4f29-ab4f-ea87935766ae")
    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_TYPE, value);
    }

    @objid ("cd86fe49-1a9f-40ca-b220-5303694705dc")
    public String getactivationCapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATIONCAPACITY, this.element);
    }

    @objid ("1b75b0ea-1ccb-4600-9246-78a22a759e53")
    public void setactivationCapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATIONCAPACITY, value);
    }

    @objid ("240fc5d5-d9e4-45a7-a20c-636650c6c9e4")
    public String getentryPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ENTRYPOINTS, this.element);
    }

    @objid ("ef3cd6d0-ad10-40be-8ecc-9d60c1d44aa9")
    public void setentryPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ENTRYPOINTS, value);
    }

    @objid ("f3981cfb-2e19-4731-b725-25815777ddfc")
    public String getadressSpace() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ADRESSSPACE, this.element);
    }

    @objid ("943b4b39-a2b4-467c-ac8c-ff6973dc04bd")
    public void setadressSpace(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ADRESSSPACE, value);
    }

    @objid ("8e571538-5064-4ed8-982a-e2111706e565")
    public List<Element> getperiodElements() {
        return ModelUtils.getTargetElements(this.element, MARTEDesignerStereotypes.PROFILEASSOCIATION_PERIODELEMENTS_SWCONCURRENTRESOURCE);
    }

    @objid ("b1e15cb0-10ee-487b-9a4a-36da390e5c53")
    public void setperiodElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_PERIODELEMENTS, value);
    }

    @objid ("9f096975-167d-47a7-af65-4ca3049046b7")
    public String getpriorityElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_PRIORITYELEMENTS, this.element);
    }

    @objid ("f56b5e5c-2450-4fde-9ff4-cdf169fd1987")
    public void setpriorityElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_PRIORITYELEMENTS, value);
    }

    @objid ("93a72b8a-0a00-417d-b79d-648d5244806b")
    public String getstackSizeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_STACKSIZEELEMENTS, this.element);
    }

    @objid ("1b6e5f29-38c7-4bfe-ad47-6ebcd2ecde25")
    public void setstackSizeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_STACKSIZEELEMENTS, value);
    }

    @objid ("feb618ac-6903-456d-af13-1f36a84636cf")
    public String getactivateServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATESERVICES, this.element);
    }

    @objid ("8460b635-7f29-47ff-ae32-166b9ebcdc96")
    public void setactivateServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATESERVICES, value);
    }

    @objid ("6faba28b-0cb9-4861-9f08-83568fc358d1")
    public String getenableConcurrencyServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ENABLECONCURRENCYSERVICES, this.element);
    }

    @objid ("d04850e8-8f9b-41a5-828f-c4d9e9afec70")
    public void setenableConcurrencyServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ENABLECONCURRENCYSERVICES, value);
    }

    @objid ("a5e1ed0c-8479-46c0-a84a-273eb59064a4")
    public String getresumeServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_RESUMESERVICES, this.element);
    }

    @objid ("51934075-84db-48d0-b2f0-9ea3c69bc4d1")
    public void setresumeServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_RESUMESERVICES, value);
    }

    @objid ("10499a86-9b0b-4d9a-bc4c-a83287ce7798")
    public String getsuspendServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_SUSPENDSERVICES, this.element);
    }

    @objid ("f0707e97-d5a2-4d94-bc40-e88c3c6c8d2e")
    public void setsuspendServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_SUSPENDSERVICES, value);
    }

    @objid ("7f9bb70f-2222-4643-847c-9c22535051e9")
    public String getterminateServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_TERMINATESERVICES, this.element);
    }

    @objid ("08cadda2-c6c6-41d4-b39a-0dc9390f5ee5")
    public void setterminateServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_TERMINATESERVICES, value);
    }

    @objid ("e953d21f-a645-4bdd-8c06-82e5a5d8ce74")
    public String getdisableConcurrencyServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_DISABLECONCURRENCYSERVICES, this.element);
    }

    @objid ("bb28add1-1ba0-4d63-af79-028169a466d5")
    public void setdisableConcurrencyServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_DISABLECONCURRENCYSERVICES, value);
    }

    @objid ("b8753482-9463-482f-909d-9f104419fe70")
    public String getshareDataResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_SHAREDATARESOURCES, this.element);
    }

    @objid ("6c6bdd2a-7a43-469d-a9b7-22486ec0e05f")
    public void setshareDataResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_SHAREDATARESOURCES, value);
    }

    @objid ("b3979c47-4814-4992-aaf7-3ee7b3a5eb97")
    public String getmessageResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_MESSAGERESOURCES, this.element);
    }

    @objid ("bee2e21e-0dc7-43f4-8196-7c229569d86c")
    public void setmessageResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_MESSAGERESOURCES, value);
    }

    @objid ("f4042c74-6318-46db-bff6-354ed6503e70")
    public String getmutualExclusionResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCES, this.element);
    }

    @objid ("0655165b-b56a-4185-a1e5-df7f0923b7a5")
    public void setmutualExclusionResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCES, value);
    }

    @objid ("2a17edf0-40bf-478e-8804-f72d1b24572c")
    public String getnotificationResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCES, this.element);
    }

    @objid ("d8f8bca7-fa37-407e-9455-814123602a6d")
    public void setnotificationResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCES, value);
    }

    @objid ("69054868-8305-4d5e-8965-c314ed20fe2c")
    public String getheapSizeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_HEAPSIZEELEMENTS, this.element);
    }

    @objid ("93715f47-4fb7-49a4-8c79-a7ebe1235e2e")
    public void setheapSizeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_HEAPSIZEELEMENTS, value);
    }

}
