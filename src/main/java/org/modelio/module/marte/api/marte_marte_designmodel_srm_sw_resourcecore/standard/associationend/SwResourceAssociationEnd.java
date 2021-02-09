/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.associationend;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.ResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << SwResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwResourceAssociationEnd extends ResourceAssociationEnd {
    public static final String STEREOTYPE_NAME = "SwResource_AssociationEnd";

    public static final String SWRESOURCE_ASSOCIATIONEND_CREATESERVICES_TAGTYPE = "SwResource_AssociationEnd_createServices";

    public static final String SWRESOURCE_ASSOCIATIONEND_DELETESERVICES_TAGTYPE = "SwResource_AssociationEnd_deleteServices";

    public static final String SWRESOURCE_ASSOCIATIONEND_IDENTIFIERELEMENTS_TAGTYPE = "SwResource_AssociationEnd_identifierElements";

    public static final String SWRESOURCE_ASSOCIATIONEND_INITIALIZESERVICES_TAGTYPE = "SwResource_AssociationEnd_initializeServices";

    public static final String SWRESOURCE_ASSOCIATIONEND_MEMORYSIZEFOOTPRINT_TAGTYPE = "SwResource_AssociationEnd_memorySizeFootprint";

    public static final String SWRESOURCE_ASSOCIATIONEND_STATEELEMENTS_TAGTYPE = "SwResource_AssociationEnd_stateElements";

    /**
     * Tells whether a {@link SwResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SwResource_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SwResource_AssociationEnd >> then instantiate a {@link SwResourceAssociationEnd} proxy.
     * 
     * @return a {@link SwResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static SwResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceAssociationEnd.STEREOTYPE_NAME);
        return SwResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SwResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SwResourceAssociationEnd} proxy or <i>null</i>.
     */
    public static SwResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return SwResourceAssociationEnd.canInstantiate(obj) ? new SwResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link SwResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SwResourceAssociationEnd.canInstantiate(obj))
        	return new SwResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SwResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwResourceAssociationEnd other = (SwResourceAssociationEnd) obj;
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
     * Getter for List<String> property 'SwResource_AssociationEnd_createServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_AssociationEnd_createServices() {
        return this.elt.getTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_CREATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_AssociationEnd_deleteServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_AssociationEnd_deleteServices() {
        return this.elt.getTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_DELETESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_AssociationEnd_identifierElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_AssociationEnd_identifierElements() {
        return this.elt.getTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_IDENTIFIERELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_AssociationEnd_initializeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_AssociationEnd_initializeServices() {
        return this.elt.getTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_INITIALIZESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwResource_AssociationEnd_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwResource_AssociationEnd_memorySizeFootprint() {
        return this.elt.getTagValue(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_AssociationEnd_stateElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_AssociationEnd_stateElements() {
        return this.elt.getTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_STATEELEMENTS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwResource_AssociationEnd_createServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_AssociationEnd_createServices(final List<String> values) {
        this.elt.putTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_CREATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_AssociationEnd_deleteServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_AssociationEnd_deleteServices(final List<String> values) {
        this.elt.putTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_DELETESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_AssociationEnd_identifierElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_AssociationEnd_identifierElements(final List<String> values) {
        this.elt.putTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_IDENTIFIERELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_AssociationEnd_initializeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_AssociationEnd_initializeServices(final List<String> values) {
        this.elt.putTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_INITIALIZESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwResource_AssociationEnd_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_AssociationEnd_memorySizeFootprint(final String value) {
        this.elt.putTagValue(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwResource_AssociationEnd_stateElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_AssociationEnd_stateElements(final List<String> values) {
        this.elt.putTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_STATEELEMENTS_TAGTYPE_ELT, values);
    }

    protected SwResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWRESOURCE_ASSOCIATIONEND_IDENTIFIERELEMENTS_TAGTYPE_ELT;

        public static TagType SWRESOURCE_ASSOCIATIONEND_STATEELEMENTS_TAGTYPE_ELT;

        public static TagType SWRESOURCE_ASSOCIATIONEND_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT;

        public static TagType SWRESOURCE_ASSOCIATIONEND_CREATESERVICES_TAGTYPE_ELT;

        public static TagType SWRESOURCE_ASSOCIATIONEND_DELETESERVICES_TAGTYPE_ELT;

        public static TagType SWRESOURCE_ASSOCIATIONEND_INITIALIZESERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01a3265c-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_ASSOCIATIONEND_IDENTIFIERELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a32663-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_ASSOCIATIONEND_STATEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a3266a-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_ASSOCIATIONEND_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a32671-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_ASSOCIATIONEND_CREATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588b1-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_ASSOCIATIONEND_DELETESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588b8-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_ASSOCIATIONEND_INITIALIZESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588bf-0ccf-11df-8525-001302895b2b");
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
