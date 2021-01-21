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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << InterruptResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("29d7cf78-1b4a-4c12-86f9-bd1ba007b730")
public class InterruptResourceAssociation extends SwConcurrentResourceAssociation {
    @objid ("855a5afa-c891-48cc-96fc-22a1a86054cf")
    public static final String STEREOTYPE_NAME = "InterruptResource_Association";

    @objid ("6a6d7e8f-8362-49c3-ae59-228dead53e32")
    public static final String INTERRUPTRESOURCE_ASSOCIATION_ISMASKABLE_TAGTYPE = "InterruptResource_Association_isMaskable";

    @objid ("2f167694-48f5-4095-9976-b3d3cf84d3c8")
    public static final String INTERRUPTRESOURCE_ASSOCIATION_KIND_TAGTYPE = "InterruptResource_Association_kind";

    @objid ("18c6d061-1140-4e91-8b83-b7ff835136c4")
    public static final String INTERRUPTRESOURCE_ASSOCIATION_MASKELEMENTS_TAGTYPE = "InterruptResource_Association_maskElements";

    @objid ("2429ce8e-126d-4060-b5ba-a3758640b745")
    public static final String INTERRUPTRESOURCE_ASSOCIATION_ROUTINECONNECTSERVICES_TAGTYPE = "InterruptResource_Association_routineConnectServices";

    @objid ("1d71db0c-ece8-4140-b38e-8d6f57dc47cc")
    public static final String INTERRUPTRESOURCE_ASSOCIATION_ROUTINEDISCONNECTSERVICES_TAGTYPE = "InterruptResource_Association_routineDisconnectServices";

    @objid ("195dd943-fa15-42ba-86f2-35f2e206414b")
    public static final String INTERRUPTRESOURCE_ASSOCIATION_VECTORELEMENTS_TAGTYPE = "InterruptResource_Association_vectorElements";

    /**
     * Tells whether a {@link InterruptResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << InterruptResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("788e4af1-7c90-4e1c-82f6-64ba87f6bbb6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << InterruptResource_Association >> then instantiate a {@link InterruptResourceAssociation} proxy.
     * 
     * @return a {@link InterruptResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("bbb7de22-2ebd-4287-86d9-1d2bcca72afd")
    public static InterruptResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceAssociation.STEREOTYPE_NAME);
        return InterruptResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link InterruptResourceAssociation} proxy from a {@link Association} stereotyped << InterruptResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link InterruptResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("b93233c3-d228-4e0d-be1e-05a27d619819")
    public static InterruptResourceAssociation instantiate(final Association obj) {
        return InterruptResourceAssociation.canInstantiate(obj) ? new InterruptResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link InterruptResourceAssociation} proxy from a {@link Association} stereotyped << InterruptResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link InterruptResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e98d6093-9abb-4c74-8273-d6a80af69606")
    public static InterruptResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (InterruptResourceAssociation.canInstantiate(obj))
        	return new InterruptResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("InterruptResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("07e109be-0aa3-49a1-8224-c6de357840ba")
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
        InterruptResourceAssociation other = (InterruptResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("3d2792b5-9349-4384-8ecc-8df762e065a7")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'InterruptResource_Association_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f072bcfc-aece-42ee-ae66-8231a1b6d1e3")
    public String getInterruptResource_Association_kind() {
        return this.elt.getTagValue(InterruptResourceAssociation.MdaTypes.INTERRUPTRESOURCE_ASSOCIATION_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Association_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c2a4a651-e1ac-4ea7-9315-38669df85825")
    public List<String> getInterruptResource_Association_maskElements() {
        return this.elt.getTagValues(InterruptResourceAssociation.MdaTypes.INTERRUPTRESOURCE_ASSOCIATION_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Association_routineConnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("84e18ba5-533e-4bfe-8ba2-fe95bd5eb56c")
    public List<String> getInterruptResource_Association_routineConnectServices() {
        return this.elt.getTagValues(InterruptResourceAssociation.MdaTypes.INTERRUPTRESOURCE_ASSOCIATION_ROUTINECONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Association_routineDisconnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5ab40b06-9987-4972-96d1-2b7b6affa175")
    public List<String> getInterruptResource_Association_routineDisconnectServices() {
        return this.elt.getTagValues(InterruptResourceAssociation.MdaTypes.INTERRUPTRESOURCE_ASSOCIATION_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Association_vectorElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c640a9d5-f605-49be-8725-a87bfb6037f3")
    public List<String> getInterruptResource_Association_vectorElements() {
        return this.elt.getTagValues(InterruptResourceAssociation.MdaTypes.INTERRUPTRESOURCE_ASSOCIATION_VECTORELEMENTS_TAGTYPE_ELT);
    }

    @objid ("60bc1e66-60f5-4ee9-91f6-da6aa5c32ef3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'InterruptResource_Association_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8daad976-d45d-4360-997c-2733ec4c24ee")
    public boolean isInterruptResource_Association_isMaskable() {
        return this.elt.isTagged(InterruptResourceAssociation.MdaTypes.INTERRUPTRESOURCE_ASSOCIATION_ISMASKABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'InterruptResource_Association_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b7a04b30-8cc7-46a8-a222-cba4dde9f1aa")
    public void setInterruptResource_Association_isMaskable(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(InterruptResourceAssociation.MdaTypes.INTERRUPTRESOURCE_ASSOCIATION_ISMASKABLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(InterruptResourceAssociation.MdaTypes.INTERRUPTRESOURCE_ASSOCIATION_ISMASKABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'InterruptResource_Association_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eb35a510-140f-4465-b5e4-d1c9359fa82d")
    public void setInterruptResource_Association_kind(final String value) {
        this.elt.putTagValue(InterruptResourceAssociation.MdaTypes.INTERRUPTRESOURCE_ASSOCIATION_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Association_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("326dda84-382c-4683-95d4-9375cf70f7a7")
    public void setInterruptResource_Association_maskElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceAssociation.MdaTypes.INTERRUPTRESOURCE_ASSOCIATION_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Association_routineConnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d1c2ff5b-6e73-4338-ac7e-98763aac9896")
    public void setInterruptResource_Association_routineConnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceAssociation.MdaTypes.INTERRUPTRESOURCE_ASSOCIATION_ROUTINECONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Association_routineDisconnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c523cce0-4150-42e7-95a5-ab0f6082b0c5")
    public void setInterruptResource_Association_routineDisconnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceAssociation.MdaTypes.INTERRUPTRESOURCE_ASSOCIATION_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Association_vectorElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6181adfa-1a92-45db-8533-e3d25ffa187d")
    public void setInterruptResource_Association_vectorElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceAssociation.MdaTypes.INTERRUPTRESOURCE_ASSOCIATION_VECTORELEMENTS_TAGTYPE_ELT, values);
    }

    @objid ("deac1f00-da44-4393-b776-e8d691c52d0f")
    protected InterruptResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("82334e2b-d24c-4137-85cf-3cf2b5dd2630")
    public static final class MdaTypes {
        @objid ("62049440-ec12-4ac7-b621-31ea42b234b9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e18d496a-6766-4fc0-aedc-ca2c74063275")
        public static TagType INTERRUPTRESOURCE_ASSOCIATION_KIND_TAGTYPE_ELT;

        @objid ("85746bd0-908b-4a04-ada7-6c3600164389")
        public static TagType INTERRUPTRESOURCE_ASSOCIATION_ISMASKABLE_TAGTYPE_ELT;

        @objid ("1a7dbad5-ff8c-442d-8544-c4ecc30ada83")
        public static TagType INTERRUPTRESOURCE_ASSOCIATION_VECTORELEMENTS_TAGTYPE_ELT;

        @objid ("87847a7b-e481-49b0-86a4-3065dbba85e0")
        public static TagType INTERRUPTRESOURCE_ASSOCIATION_MASKELEMENTS_TAGTYPE_ELT;

        @objid ("d9a15746-b77d-4c8c-bef9-231f3938c4f6")
        public static TagType INTERRUPTRESOURCE_ASSOCIATION_ROUTINECONNECTSERVICES_TAGTYPE_ELT;

        @objid ("12e0f367-0ab0-44bb-a909-5febe1945b0a")
        public static TagType INTERRUPTRESOURCE_ASSOCIATION_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT;

        @objid ("7b1f321a-7edd-4968-8d91-380d33a607c6")
        private static Stereotype MDAASSOCDEP;

        @objid ("59f9999c-ca80-48c4-956e-4dbe2b6e0643")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0600913e-3c24-4541-a056-985bdf6feefa")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cb98a541-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_ASSOCIATION_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cb98a542-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_ASSOCIATION_ISMASKABLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cb98a543-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_ASSOCIATION_VECTORELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cb98a544-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_ASSOCIATION_MASKELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cb98a545-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_ASSOCIATION_ROUTINECONNECTSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cb98a546-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_ASSOCIATION_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cb98a547-10d0-11df-81d9-0014222a9f79");
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
