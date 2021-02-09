/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.associationend;

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
public class InterruptResourceAssociationEnd extends SwConcurrentResourceAssociationEnd {
    public static final String STEREOTYPE_NAME = "InterruptResource_AssociationEnd";

    public static final String INTERRUPTRESOURCE_ASSOCIATIONEND_ISMASKABLE_TAGTYPE = "InterruptResource_AssociationEnd_isMaskable";

    public static final String INTERRUPTRESOURCE_ASSOCIATIONEND_KIND_TAGTYPE = "InterruptResource_AssociationEnd_kind";

    public static final String INTERRUPTRESOURCE_ASSOCIATIONEND_MASKELEMENTS_TAGTYPE = "InterruptResource_AssociationEnd_maskElements";

    public static final String INTERRUPTRESOURCE_ASSOCIATIONEND_ROUTINECONNECTSERVICES_TAGTYPE = "InterruptResource_AssociationEnd_routineConnectServices";

    public static final String INTERRUPTRESOURCE_ASSOCIATIONEND_ROUTINEDISCONNECTSERVICES_TAGTYPE = "InterruptResource_AssociationEnd_routineDisconnectServices";

    public static final String INTERRUPTRESOURCE_ASSOCIATIONEND_VECTORELEMENTS_TAGTYPE = "InterruptResource_AssociationEnd_vectorElements";

    /**
     * Tells whether a {@link InterruptResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << InterruptResource_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << InterruptResource_AssociationEnd >> then instantiate a {@link InterruptResourceAssociationEnd} proxy.
     * 
     * @return a {@link InterruptResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static InterruptResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceAssociationEnd.STEREOTYPE_NAME);
        return InterruptResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link InterruptResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << InterruptResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link InterruptResourceAssociationEnd} proxy or <i>null</i>.
     */
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
    public static InterruptResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (InterruptResourceAssociationEnd.canInstantiate(obj))
        	return new InterruptResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("InterruptResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        InterruptResourceAssociationEnd other = (InterruptResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'InterruptResource_AssociationEnd_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getInterruptResource_AssociationEnd_kind() {
        return this.elt.getTagValue(InterruptResourceAssociationEnd.MdaTypes.INTERRUPTRESOURCE_ASSOCIATIONEND_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_AssociationEnd_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getInterruptResource_AssociationEnd_maskElements() {
        return this.elt.getTagValues(InterruptResourceAssociationEnd.MdaTypes.INTERRUPTRESOURCE_ASSOCIATIONEND_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_AssociationEnd_routineConnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getInterruptResource_AssociationEnd_routineConnectServices() {
        return this.elt.getTagValues(InterruptResourceAssociationEnd.MdaTypes.INTERRUPTRESOURCE_ASSOCIATIONEND_ROUTINECONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_AssociationEnd_routineDisconnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getInterruptResource_AssociationEnd_routineDisconnectServices() {
        return this.elt.getTagValues(InterruptResourceAssociationEnd.MdaTypes.INTERRUPTRESOURCE_ASSOCIATIONEND_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_AssociationEnd_vectorElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getInterruptResource_AssociationEnd_vectorElements() {
        return this.elt.getTagValues(InterruptResourceAssociationEnd.MdaTypes.INTERRUPTRESOURCE_ASSOCIATIONEND_VECTORELEMENTS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'InterruptResource_AssociationEnd_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isInterruptResource_AssociationEnd_isMaskable() {
        return this.elt.isTagged(InterruptResourceAssociationEnd.MdaTypes.INTERRUPTRESOURCE_ASSOCIATIONEND_ISMASKABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'InterruptResource_AssociationEnd_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
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
    public void setInterruptResource_AssociationEnd_kind(final String value) {
        this.elt.putTagValue(InterruptResourceAssociationEnd.MdaTypes.INTERRUPTRESOURCE_ASSOCIATIONEND_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'InterruptResource_AssociationEnd_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_AssociationEnd_maskElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceAssociationEnd.MdaTypes.INTERRUPTRESOURCE_ASSOCIATIONEND_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_AssociationEnd_routineConnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_AssociationEnd_routineConnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceAssociationEnd.MdaTypes.INTERRUPTRESOURCE_ASSOCIATIONEND_ROUTINECONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_AssociationEnd_routineDisconnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_AssociationEnd_routineDisconnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceAssociationEnd.MdaTypes.INTERRUPTRESOURCE_ASSOCIATIONEND_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_AssociationEnd_vectorElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_AssociationEnd_vectorElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceAssociationEnd.MdaTypes.INTERRUPTRESOURCE_ASSOCIATIONEND_VECTORELEMENTS_TAGTYPE_ELT, values);
    }

    protected InterruptResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_ASSOCIATIONEND_KIND_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_ASSOCIATIONEND_ISMASKABLE_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_ASSOCIATIONEND_VECTORELEMENTS_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_ASSOCIATIONEND_MASKELEMENTS_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_ASSOCIATIONEND_ROUTINECONNECTSERVICES_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_ASSOCIATIONEND_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
