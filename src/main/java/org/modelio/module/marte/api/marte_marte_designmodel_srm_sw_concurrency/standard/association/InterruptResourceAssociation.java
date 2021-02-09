/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.association;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
public class InterruptResourceAssociation extends SwConcurrentResourceAssociation {
    public static final String STEREOTYPE_NAME = "InterruptResource_Association";

    public static final String INTERRUPTRESOURCE_ASSOCIATION_ISMASKABLE_TAGTYPE = "InterruptResource_Association_isMaskable";

    public static final String INTERRUPTRESOURCE_ASSOCIATION_KIND_TAGTYPE = "InterruptResource_Association_kind";

    public static final String INTERRUPTRESOURCE_ASSOCIATION_MASKELEMENTS_TAGTYPE = "InterruptResource_Association_maskElements";

    public static final String INTERRUPTRESOURCE_ASSOCIATION_ROUTINECONNECTSERVICES_TAGTYPE = "InterruptResource_Association_routineConnectServices";

    public static final String INTERRUPTRESOURCE_ASSOCIATION_ROUTINEDISCONNECTSERVICES_TAGTYPE = "InterruptResource_Association_routineDisconnectServices";

    public static final String INTERRUPTRESOURCE_ASSOCIATION_VECTORELEMENTS_TAGTYPE = "InterruptResource_Association_vectorElements";

    /**
     * Tells whether a {@link InterruptResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << InterruptResource_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << InterruptResource_Association >> then instantiate a {@link InterruptResourceAssociation} proxy.
     * 
     * @return a {@link InterruptResourceAssociation} proxy on the created {@link Association}.
     */
    public static InterruptResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceAssociation.STEREOTYPE_NAME);
        return InterruptResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link InterruptResourceAssociation} proxy from a {@link Association} stereotyped << InterruptResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link InterruptResourceAssociation} proxy or <i>null</i>.
     */
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
    public static InterruptResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (InterruptResourceAssociation.canInstantiate(obj))
        	return new InterruptResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("InterruptResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'InterruptResource_Association_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getInterruptResource_Association_kind() {
        return this.elt.getTagValue(InterruptResourceAssociation.MdaTypes.INTERRUPTRESOURCE_ASSOCIATION_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Association_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getInterruptResource_Association_maskElements() {
        return this.elt.getTagValues(InterruptResourceAssociation.MdaTypes.INTERRUPTRESOURCE_ASSOCIATION_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Association_routineConnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getInterruptResource_Association_routineConnectServices() {
        return this.elt.getTagValues(InterruptResourceAssociation.MdaTypes.INTERRUPTRESOURCE_ASSOCIATION_ROUTINECONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Association_routineDisconnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getInterruptResource_Association_routineDisconnectServices() {
        return this.elt.getTagValues(InterruptResourceAssociation.MdaTypes.INTERRUPTRESOURCE_ASSOCIATION_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Association_vectorElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getInterruptResource_Association_vectorElements() {
        return this.elt.getTagValues(InterruptResourceAssociation.MdaTypes.INTERRUPTRESOURCE_ASSOCIATION_VECTORELEMENTS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'InterruptResource_Association_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isInterruptResource_Association_isMaskable() {
        return this.elt.isTagged(InterruptResourceAssociation.MdaTypes.INTERRUPTRESOURCE_ASSOCIATION_ISMASKABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'InterruptResource_Association_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
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
    public void setInterruptResource_Association_kind(final String value) {
        this.elt.putTagValue(InterruptResourceAssociation.MdaTypes.INTERRUPTRESOURCE_ASSOCIATION_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Association_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Association_maskElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceAssociation.MdaTypes.INTERRUPTRESOURCE_ASSOCIATION_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Association_routineConnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Association_routineConnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceAssociation.MdaTypes.INTERRUPTRESOURCE_ASSOCIATION_ROUTINECONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Association_routineDisconnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Association_routineDisconnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceAssociation.MdaTypes.INTERRUPTRESOURCE_ASSOCIATION_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Association_vectorElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Association_vectorElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceAssociation.MdaTypes.INTERRUPTRESOURCE_ASSOCIATION_VECTORELEMENTS_TAGTYPE_ELT, values);
    }

    protected InterruptResourceAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_ASSOCIATION_KIND_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_ASSOCIATION_ISMASKABLE_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_ASSOCIATION_VECTORELEMENTS_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_ASSOCIATION_MASKELEMENTS_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_ASSOCIATION_ROUTINECONNECTSERVICES_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_ASSOCIATION_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
