/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << InterruptResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("27bff3a2-0e23-40c4-8830-a96f20e08c60")
public class InterruptResourceAssociationEnd extends SwConcurrentResourceAssociationEnd {
    @objid ("c925f09a-ffce-40e0-9373-26edfc091a42")
    public static final String STEREOTYPE_NAME = "InterruptResource_AssociationEnd";

    @objid ("fa8f87f0-c030-474f-9347-ea77485442d3")
    public static final String INTERRUPTRESOURCE_ASSOCIATIONEND_ISMASKABLE_TAGTYPE = "InterruptResource_AssociationEnd_isMaskable";

    @objid ("bb15672b-e393-43ef-ac75-fb4325eebbf3")
    public static final String INTERRUPTRESOURCE_ASSOCIATIONEND_KIND_TAGTYPE = "InterruptResource_AssociationEnd_kind";

    @objid ("b4d85a90-e132-4379-98ad-96acd1c82ec0")
    public static final String INTERRUPTRESOURCE_ASSOCIATIONEND_MASKELEMENTS_TAGTYPE = "InterruptResource_AssociationEnd_maskElements";

    @objid ("eef8261e-1ab3-4680-9ceb-568db41db387")
    public static final String INTERRUPTRESOURCE_ASSOCIATIONEND_ROUTINECONNECTSERVICES_TAGTYPE = "InterruptResource_AssociationEnd_routineConnectServices";

    @objid ("60b7f9aa-3209-4473-944d-b788717e8b55")
    public static final String INTERRUPTRESOURCE_ASSOCIATIONEND_ROUTINEDISCONNECTSERVICES_TAGTYPE = "InterruptResource_AssociationEnd_routineDisconnectServices";

    @objid ("288d1751-e3ca-4b35-9ee1-8d98ce1eb7aa")
    public static final String INTERRUPTRESOURCE_ASSOCIATIONEND_VECTORELEMENTS_TAGTYPE = "InterruptResource_AssociationEnd_vectorElements";

    /**
     * Tells whether a {@link InterruptResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << InterruptResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("12f6aef4-714b-4cf8-9d82-7536a9084d87")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << InterruptResource_AssociationEnd >> then instantiate a {@link InterruptResourceAssociationEnd} proxy.
     * 
     * @return a {@link InterruptResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("81048f7b-65a4-4600-b161-06c2616a4ca8")
    public static InterruptResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceAssociationEnd.STEREOTYPE_NAME);
        return InterruptResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link InterruptResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << InterruptResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link InterruptResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("8580d0f6-6bc7-466c-a610-577013ed194e")
    public static InterruptResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return InterruptResourceAssociationEnd.canInstantiate(obj) ? new InterruptResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link InterruptResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << InterruptResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link InterruptResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("fbddb455-482d-4199-b1cf-cfd5d7f1bd6c")
    public static InterruptResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (InterruptResourceAssociationEnd.canInstantiate(obj))
        	return new InterruptResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("InterruptResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3efe79b2-4f91-4ebf-9c4a-4850ae3dcfa0")
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
        InterruptResourceAssociationEnd other = (InterruptResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("8e2f690d-216e-4684-9d20-0f8eb67a9f13")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'InterruptResource_AssociationEnd_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fad481df-dee0-486e-9e9b-d43d400a42d1")
    public String getInterruptResource_AssociationEnd_kind() {
        return this.elt.getTagValue(InterruptResourceAssociationEnd.MdaTypes.INTERRUPTRESOURCE_ASSOCIATIONEND_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_AssociationEnd_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9cee3c6a-e851-4e6a-913b-dbf3c2a80396")
    public List<String> getInterruptResource_AssociationEnd_maskElements() {
        return this.elt.getTagValues(InterruptResourceAssociationEnd.MdaTypes.INTERRUPTRESOURCE_ASSOCIATIONEND_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_AssociationEnd_routineConnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ba051d73-151f-4b4c-8695-f905c5a92260")
    public List<String> getInterruptResource_AssociationEnd_routineConnectServices() {
        return this.elt.getTagValues(InterruptResourceAssociationEnd.MdaTypes.INTERRUPTRESOURCE_ASSOCIATIONEND_ROUTINECONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_AssociationEnd_routineDisconnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("66c0e669-2124-446f-9839-238132c75c1a")
    public List<String> getInterruptResource_AssociationEnd_routineDisconnectServices() {
        return this.elt.getTagValues(InterruptResourceAssociationEnd.MdaTypes.INTERRUPTRESOURCE_ASSOCIATIONEND_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_AssociationEnd_vectorElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b4104cd5-e332-408e-b225-a7de910cdfc7")
    public List<String> getInterruptResource_AssociationEnd_vectorElements() {
        return this.elt.getTagValues(InterruptResourceAssociationEnd.MdaTypes.INTERRUPTRESOURCE_ASSOCIATIONEND_VECTORELEMENTS_TAGTYPE_ELT);
    }

    @objid ("69bc6f09-c55b-43c6-b9fc-a8dc14714d54")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'InterruptResource_AssociationEnd_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a3fc4aac-2623-4a26-b6b0-ffc08a837c4a")
    public boolean isInterruptResource_AssociationEnd_isMaskable() {
        return this.elt.isTagged(InterruptResourceAssociationEnd.MdaTypes.INTERRUPTRESOURCE_ASSOCIATIONEND_ISMASKABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'InterruptResource_AssociationEnd_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f0e9e799-cb78-4747-ad02-16c0447af790")
    public void setInterruptResource_AssociationEnd_isMaskable(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(InterruptResourceAssociationEnd.MdaTypes.INTERRUPTRESOURCE_ASSOCIATIONEND_ISMASKABLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(InterruptResourceAssociationEnd.MdaTypes.INTERRUPTRESOURCE_ASSOCIATIONEND_ISMASKABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'InterruptResource_AssociationEnd_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e3d4ca8a-042c-403c-a38a-d4208b16f512")
    public void setInterruptResource_AssociationEnd_kind(final String value) {
        this.elt.putTagValue(InterruptResourceAssociationEnd.MdaTypes.INTERRUPTRESOURCE_ASSOCIATIONEND_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'InterruptResource_AssociationEnd_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4ae72f6e-78e2-467c-a2a4-f55ee6fddbf6")
    public void setInterruptResource_AssociationEnd_maskElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceAssociationEnd.MdaTypes.INTERRUPTRESOURCE_ASSOCIATIONEND_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_AssociationEnd_routineConnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eb320711-348c-4737-bef4-071dd9721ce4")
    public void setInterruptResource_AssociationEnd_routineConnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceAssociationEnd.MdaTypes.INTERRUPTRESOURCE_ASSOCIATIONEND_ROUTINECONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_AssociationEnd_routineDisconnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ac247f15-d775-4df3-8c0a-7190a1dbb68d")
    public void setInterruptResource_AssociationEnd_routineDisconnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceAssociationEnd.MdaTypes.INTERRUPTRESOURCE_ASSOCIATIONEND_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_AssociationEnd_vectorElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7bbf69db-f093-4c40-beba-a019dbbe2d59")
    public void setInterruptResource_AssociationEnd_vectorElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceAssociationEnd.MdaTypes.INTERRUPTRESOURCE_ASSOCIATIONEND_VECTORELEMENTS_TAGTYPE_ELT, values);
    }

    @objid ("4ef393d5-f655-4a93-9018-919c77b0f7bf")
    protected InterruptResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("26d8e667-2dab-435a-b080-f1029848af6c")
    public static final class MdaTypes {
        @objid ("aafdbabc-317a-41ac-b046-2fde8aa02a9b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3a7feffc-ea49-41ff-b695-8538ef01c3bb")
        public static TagType INTERRUPTRESOURCE_ASSOCIATIONEND_KIND_TAGTYPE_ELT;

        @objid ("a665208f-b5fe-483e-a9b6-f85e239de668")
        public static TagType INTERRUPTRESOURCE_ASSOCIATIONEND_ISMASKABLE_TAGTYPE_ELT;

        @objid ("ad9220c3-8a45-416c-8b3c-f04215b255a0")
        public static TagType INTERRUPTRESOURCE_ASSOCIATIONEND_VECTORELEMENTS_TAGTYPE_ELT;

        @objid ("801cb554-6c4b-4916-90c3-778cbc010ff1")
        public static TagType INTERRUPTRESOURCE_ASSOCIATIONEND_MASKELEMENTS_TAGTYPE_ELT;

        @objid ("644018da-10ac-4911-8149-4f0ad001a92f")
        public static TagType INTERRUPTRESOURCE_ASSOCIATIONEND_ROUTINECONNECTSERVICES_TAGTYPE_ELT;

        @objid ("77005cfb-6b1e-48b4-b62a-dcba1e16e7fc")
        public static TagType INTERRUPTRESOURCE_ASSOCIATIONEND_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT;

        @objid ("59f1e72e-5b1b-4dc9-938e-927c2016016c")
        private static Stereotype MDAASSOCDEP;

        @objid ("1d23f3f8-87ca-4ceb-9efb-7eda48a6cf0c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2da87d32-2a6e-4765-b3a6-1aed2c8bc7c9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01c94b7c-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_ASSOCIATIONEND_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b83-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_ASSOCIATIONEND_ISMASKABLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b8a-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_ASSOCIATIONEND_VECTORELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b91-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_ASSOCIATIONEND_MASKELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b98-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_ASSOCIATIONEND_ROUTINECONNECTSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b9f-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_ASSOCIATIONEND_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01cbadd1-0ccf-11df-8525-001302895b2b");
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
