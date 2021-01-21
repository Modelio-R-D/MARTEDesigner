/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.association;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.association.SwResourceAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << SwConcurrentResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8c2f87b9-b23f-4473-a72a-978e336291a8")
public class SwConcurrentResourceAssociation extends SwResourceAssociation {
    @objid ("7a27398a-e77a-4928-870e-07e49eddd1ac")
    public static final String STEREOTYPE_NAME = "SwConcurrentResource_Association";

    @objid ("d45b529f-c69a-4861-80ad-f270752542ae")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_ACTIVATESERVICES_TAGTYPE = "SwConcurrentResource_Association_activateServices";

    @objid ("a220bbf0-626b-4b1f-90c0-6f59a021c4fb")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_ACTIVATIONCAPACITY_TAGTYPE = "SwConcurrentResource_Association_activationCapacity";

    @objid ("a5274ed9-d50c-4bbb-920f-d3c3f0e52981")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_ADRESSSPACE_TAGTYPE = "SwConcurrentResource_Association_adressSpace";

    @objid ("3202e6e8-5259-441b-a0c3-fbe81e8b123f")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_DISABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Association_disableConcurrencyServices";

    @objid ("480a8a40-2b77-4dcd-bea1-5cf3c9762d64")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_ENABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Association_enableConcurrencyServices";

    @objid ("259c8226-b6a6-4b7d-b7b8-73f553bb08c2")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_ENTRYPOINTS_TAGTYPE = "SwConcurrentResource_Association_entryPoints";

    @objid ("cdd5b41b-119f-47a5-ae66-11ad3de9a1b0")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_HEAPSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Association_heapSizeElements";

    @objid ("a79efa3d-df48-41ab-9412-1ced90d6f06a")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_MESSAGERESOURCES_TAGTYPE = "SwConcurrentResource_Association_messageResources";

    @objid ("df4eff87-fd67-4af1-9ca4-f265d4b5bcf3")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_MUTUALEXCLUSIONRESOURCES_TAGTYPE = "SwConcurrentResource_Association_mutualExclusionResources";

    @objid ("6dec68fa-1ae1-4b22-be3d-b77a0c360248")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_NOTIFICATIONRESOURCES_TAGTYPE = "SwConcurrentResource_Association_notificationResources";

    @objid ("4b656b5a-93d3-42e3-99b2-c9fd059cb18b")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_PERIODELEMENTS_TAGTYPE = "SwConcurrentResource_Association_periodElements";

    @objid ("e41b3ee4-baa8-4348-8750-ab8825c64113")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_PRIORITYELEMENTS_TAGTYPE = "SwConcurrentResource_Association_priorityElements";

    @objid ("3cedd77b-3511-4f30-b8c4-8d36e5ba46b8")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_RESUMESERVICES_TAGTYPE = "SwConcurrentResource_Association_resumeServices";

    @objid ("640bbb5c-cf8f-47d5-92e1-4f1696f35830")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_SHAREDATARESOURCES_TAGTYPE = "SwConcurrentResource_Association_shareDataResources";

    @objid ("67c416b9-ee59-41d1-b3ef-d4da94389e2c")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_STACKSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Association_stackSizeElements";

    @objid ("4cbd1854-e23f-405c-a968-cc538f7aa041")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_SUSPENDSERVICES_TAGTYPE = "SwConcurrentResource_Association_suspendServices";

    @objid ("a3390864-943f-4f85-bffd-17926ed73983")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_TERMINATESERVICES_TAGTYPE = "SwConcurrentResource_Association_terminateServices";

    @objid ("63ff9ba1-da9f-481c-8a91-793aa8317bcb")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_TYPE_TAGTYPE = "SwConcurrentResource_Association_type";

    /**
     * Tells whether a {@link SwConcurrentResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SwConcurrentResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("bd9e6056-8c31-412c-9357-ef064019783c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SwConcurrentResource_Association >> then instantiate a {@link SwConcurrentResourceAssociation} proxy.
     * 
     * @return a {@link SwConcurrentResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("8a32cf04-2cef-4a8f-b3b4-99f87b3b9729")
    public static SwConcurrentResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceAssociation.STEREOTYPE_NAME);
        return SwConcurrentResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceAssociation} proxy from a {@link Association} stereotyped << SwConcurrentResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SwConcurrentResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("f787cdda-cc0c-4d0e-a186-4a5c82a3354d")
    public static SwConcurrentResourceAssociation instantiate(final Association obj) {
        return SwConcurrentResourceAssociation.canInstantiate(obj) ? new SwConcurrentResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceAssociation} proxy from a {@link Association} stereotyped << SwConcurrentResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link SwConcurrentResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1723c7fb-b048-4d08-870a-4902a27d5f86")
    public static SwConcurrentResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SwConcurrentResourceAssociation.canInstantiate(obj))
        	return new SwConcurrentResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("SwConcurrentResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("dc9fd014-211c-4501-a9c8-1e751906f4f9")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        SwConcurrentResourceAssociation other = (SwConcurrentResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("56ae3b48-7d83-41dc-b8ad-7e7a8678e769")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_activateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8f4d9363-5c4b-4f7a-ae52-4d0e3dc41033")
    public List<String> getSwConcurrentResource_Association_activateServices() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_ACTIVATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Association_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("275a56a8-5c8d-4df0-b858-a499e7d8e70f")
    public String getSwConcurrentResource_Association_activationCapacity() {
        return this.elt.getTagValue(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_ACTIVATIONCAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_adressSpace'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("74838299-3281-44ae-b3a8-282d945be5cc")
    public List<String> getSwConcurrentResource_Association_adressSpace() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_ADRESSSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_disableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("125071a9-3795-4d45-b7a2-c809a2822b0a")
    public List<String> getSwConcurrentResource_Association_disableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_enableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c56b2ab9-108a-48ed-8ccb-9eec7a4e1b2d")
    public List<String> getSwConcurrentResource_Association_enableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_entryPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("dfefe52e-6c41-4908-a772-5bc4139c6e84")
    public List<String> getSwConcurrentResource_Association_entryPoints() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_ENTRYPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_heapSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ebc22ac3-e892-4fde-a8db-27e25e852f15")
    public List<String> getSwConcurrentResource_Association_heapSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_HEAPSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_messageResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7afd687b-668b-4bdd-a748-9f09f261371a")
    public List<String> getSwConcurrentResource_Association_messageResources() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_MESSAGERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_mutualExclusionResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("faa10cc2-bb6d-45ae-b9cf-cde3ee53c4d1")
    public List<String> getSwConcurrentResource_Association_mutualExclusionResources() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_notificationResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3393db7d-fd35-4e31-ba87-46e6f8d4c9b3")
    public List<String> getSwConcurrentResource_Association_notificationResources() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_NOTIFICATIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_periodElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("30282381-e2dd-42eb-bc5b-8343568008ee")
    public List<String> getSwConcurrentResource_Association_periodElements() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_PERIODELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_priorityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6fe50ce4-6578-4ed7-b7a6-76aa9e53c0d1")
    public List<String> getSwConcurrentResource_Association_priorityElements() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_PRIORITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_resumeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("588d4f4a-ec7f-4fb4-988e-c53a3a5b2ebf")
    public List<String> getSwConcurrentResource_Association_resumeServices() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_RESUMESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_shareDataResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5ccb5e61-bb04-4a95-a7d4-f5e8cab7880d")
    public List<String> getSwConcurrentResource_Association_shareDataResources() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_SHAREDATARESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_stackSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e0b3e66a-e890-4a2c-9d43-d14f63618b8f")
    public List<String> getSwConcurrentResource_Association_stackSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_STACKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_suspendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("dd44b2b2-7531-40ba-8884-44cc67140ac4")
    public List<String> getSwConcurrentResource_Association_suspendServices() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_SUSPENDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_terminateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5198bb7a-1d28-41c9-a268-41dea45725fd")
    public List<String> getSwConcurrentResource_Association_terminateServices() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_TERMINATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Association_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3570bee7-3f7d-4944-affb-d83d753e8196")
    public String getSwConcurrentResource_Association_type() {
        return this.elt.getTagValue(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_TYPE_TAGTYPE_ELT);
    }

    @objid ("29d1316c-cecc-4799-9cef-458128009149")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_activateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("020bfd60-f551-4b28-beaa-b76ba5572224")
    public void setSwConcurrentResource_Association_activateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_ACTIVATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Association_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("48de4195-1ade-441b-9378-542c4d201a29")
    public void setSwConcurrentResource_Association_activationCapacity(final String value) {
        this.elt.putTagValue(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_ACTIVATIONCAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_adressSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9e17e26c-d66c-4ec4-bf73-1f0c3e6d9fab")
    public void setSwConcurrentResource_Association_adressSpace(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_ADRESSSPACE_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_disableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8eab08c1-2e60-4734-8b33-02b04716bc13")
    public void setSwConcurrentResource_Association_disableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_enableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4fb67dce-0722-41c4-82dc-3d91ec98de89")
    public void setSwConcurrentResource_Association_enableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_entryPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b04716d2-4539-4260-bbf8-9fd0b1706566")
    public void setSwConcurrentResource_Association_entryPoints(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_ENTRYPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_heapSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a588910b-dab0-4eae-bbbd-75d0c10a392e")
    public void setSwConcurrentResource_Association_heapSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_HEAPSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_messageResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("65a6063f-5212-464c-8ed0-b3189234469c")
    public void setSwConcurrentResource_Association_messageResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_MESSAGERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_mutualExclusionResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8da15e0f-aab9-46dc-a2c0-28e6ab9edcb2")
    public void setSwConcurrentResource_Association_mutualExclusionResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_notificationResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("50e429a4-938a-48ae-b3b1-588119548b46")
    public void setSwConcurrentResource_Association_notificationResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_NOTIFICATIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_periodElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2b5c1ad9-8db7-49bb-902b-5d6eaafe45e6")
    public void setSwConcurrentResource_Association_periodElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_PERIODELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_priorityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cd3843c2-4337-41be-a600-c42b3e5418ca")
    public void setSwConcurrentResource_Association_priorityElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_PRIORITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_resumeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1983961c-6169-487c-9404-bef4c000e98f")
    public void setSwConcurrentResource_Association_resumeServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_RESUMESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_shareDataResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5db4cfcd-0870-474c-8a3d-c785172e5179")
    public void setSwConcurrentResource_Association_shareDataResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_SHAREDATARESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_stackSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b96ae6c9-85f2-4f62-9548-8e6308911c63")
    public void setSwConcurrentResource_Association_stackSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_STACKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_suspendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("94b77b19-b3ad-487f-988a-e6beb8d32ad4")
    public void setSwConcurrentResource_Association_suspendServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_SUSPENDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_terminateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d65040a3-9c1a-4ec1-a51d-cbbc3b842c8a")
    public void setSwConcurrentResource_Association_terminateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_TERMINATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Association_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d229372e-c6c6-4af4-a029-83035359ebab")
    public void setSwConcurrentResource_Association_type(final String value) {
        this.elt.putTagValue(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("53203b77-f53a-4fb5-9b19-f7fbe3ab773f")
    protected SwConcurrentResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("d5977d46-d1ef-4b98-81a5-aa922123b9fe")
    public static final class MdaTypes {
        @objid ("285ec8b3-2368-4015-a846-f0b39b14ae13")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7b8ad297-fac8-4618-94f8-b317caff9d81")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_TYPE_TAGTYPE_ELT;

        @objid ("fd7893d0-7eae-4244-9220-50219ccfe840")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_ACTIVATIONCAPACITY_TAGTYPE_ELT;

        @objid ("0ea6ca16-5f6b-4e7f-85f6-4ceb4f008793")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_ENTRYPOINTS_TAGTYPE_ELT;

        @objid ("bf3ec01c-c3f2-4f56-bf92-d3cf2fdc68ea")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_ADRESSSPACE_TAGTYPE_ELT;

        @objid ("00c7cfc0-e0b6-47a3-9336-6db5fbf1b405")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_PERIODELEMENTS_TAGTYPE_ELT;

        @objid ("879ec584-209f-4a2f-bd31-ff1f31b96383")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_PRIORITYELEMENTS_TAGTYPE_ELT;

        @objid ("a76cd21b-89f2-4a94-8bd3-81e944e940c6")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_STACKSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("1823c86f-806e-4b29-bc5b-891c18689771")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_ACTIVATESERVICES_TAGTYPE_ELT;

        @objid ("90b76279-41f2-43a9-98bf-3d57dd03e67d")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        @objid ("89857dad-2176-4f24-81ab-de8a0bd2517e")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_RESUMESERVICES_TAGTYPE_ELT;

        @objid ("c0c8ce62-729f-4cec-984c-ff15811a95e5")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_SUSPENDSERVICES_TAGTYPE_ELT;

        @objid ("f20b538e-601b-4ee5-b83a-aa46f79f87ed")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_TERMINATESERVICES_TAGTYPE_ELT;

        @objid ("8654a8c5-e191-43b1-a810-119be6ba4da9")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        @objid ("31dd0700-d597-4477-8892-1e21c47e1b55")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_SHAREDATARESOURCES_TAGTYPE_ELT;

        @objid ("3e1cc124-7e32-4ca3-b93d-2af9fc4af3d7")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_MESSAGERESOURCES_TAGTYPE_ELT;

        @objid ("b8d3924f-2c28-47e2-ada9-755fe9da4d5c")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT;

        @objid ("3610d279-178c-41a5-804f-245fdffac9b7")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_NOTIFICATIONRESOURCES_TAGTYPE_ELT;

        @objid ("821d07e0-7380-4391-b3d2-78307189f3f7")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_HEAPSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("57398ad2-fbe9-436c-a3ee-a468f04eedfa")
        private static Stereotype MDAASSOCDEP;

        @objid ("062fe4f6-a982-4965-9544-b3a720637c90")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("eae3fa80-7ea3-45ab-85ff-488d70833b40")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "87b85da9-10d0-11df-81d9-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf867d-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_ACTIVATIONCAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf867e-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_ENTRYPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf867f-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_ADRESSSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf8680-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_PERIODELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf8681-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_PRIORITYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf8682-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_STACKSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf8683-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_ACTIVATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf8684-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf8685-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_RESUMESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf8686-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_SUSPENDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf8687-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_TERMINATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf8688-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf8689-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_SHAREDATARESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf868a-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_MESSAGERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf868b-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf868c-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_NOTIFICATIONRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf868d-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_HEAPSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf868e-172b-11df-b92a-0014222a9f79");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
