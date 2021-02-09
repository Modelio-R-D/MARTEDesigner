/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.collaboration;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.collaboration.GrServiceCollaboration;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Collaboration} with << SwAccessService_Collaboration >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwAccessServiceCollaboration extends GrServiceCollaboration {
    public static final String STEREOTYPE_NAME = "SwAccessService_Collaboration";

    public static final String SWACCESSSERVICE_COLLABORATION_ACCESSEDELEMENT_TAGTYPE = "SwAccessService_Collaboration_accessedElement";

    public static final String SWACCESSSERVICE_COLLABORATION_ISMODIFIER_TAGTYPE = "SwAccessService_Collaboration_isModifier";

    /**
     * Tells whether a {@link SwAccessServiceCollaboration proxy} can be instantiated from a {@link MObject} checking it is a {@link Collaboration} stereotyped << SwAccessService_Collaboration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Collaboration) && ((Collaboration) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwAccessServiceCollaboration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Collaboration} stereotyped << SwAccessService_Collaboration >> then instantiate a {@link SwAccessServiceCollaboration} proxy.
     * 
     * @return a {@link SwAccessServiceCollaboration} proxy on the created {@link Collaboration}.
     */
    public static SwAccessServiceCollaboration create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Collaboration");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwAccessServiceCollaboration.STEREOTYPE_NAME);
        return SwAccessServiceCollaboration.instantiate((Collaboration)e);
    }

    /**
     * Tries to instantiate a {@link SwAccessServiceCollaboration} proxy from a {@link Collaboration} stereotyped << SwAccessService_Collaboration >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Collaboration
     * @return a {@link SwAccessServiceCollaboration} proxy or <i>null</i>.
     */
    public static SwAccessServiceCollaboration instantiate(final Collaboration obj) {
        return SwAccessServiceCollaboration.canInstantiate(obj) ? new SwAccessServiceCollaboration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwAccessServiceCollaboration} proxy from a {@link Collaboration} stereotyped << SwAccessService_Collaboration >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Collaboration}
     * @return a {@link SwAccessServiceCollaboration} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwAccessServiceCollaboration safeInstantiate(final Collaboration obj) throws IllegalArgumentException {
        if (SwAccessServiceCollaboration.canInstantiate(obj))
        	return new SwAccessServiceCollaboration(obj);
        else
        	throw new IllegalArgumentException("SwAccessServiceCollaboration: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwAccessServiceCollaboration other = (SwAccessServiceCollaboration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Collaboration}. 
     * @return the Collaboration represented by this proxy, never null.
     */
    @Override
    public Collaboration getElement() {
        return (Collaboration)super.getElement();
    }

    /**
     * Getter for string property 'SwAccessService_Collaboration_accessedElement'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwAccessService_Collaboration_accessedElement() {
        return this.elt.getTagValue(SwAccessServiceCollaboration.MdaTypes.SWACCESSSERVICE_COLLABORATION_ACCESSEDELEMENT_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwAccessService_Collaboration_isModifier'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSwAccessService_Collaboration_isModifier() {
        return this.elt.isTagged(SwAccessServiceCollaboration.MdaTypes.SWACCESSSERVICE_COLLABORATION_ISMODIFIER_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SwAccessService_Collaboration_accessedElement'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwAccessService_Collaboration_accessedElement(final String value) {
        this.elt.putTagValue(SwAccessServiceCollaboration.MdaTypes.SWACCESSSERVICE_COLLABORATION_ACCESSEDELEMENT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwAccessService_Collaboration_isModifier'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwAccessService_Collaboration_isModifier(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwAccessServiceCollaboration.MdaTypes.SWACCESSSERVICE_COLLABORATION_ISMODIFIER_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwAccessServiceCollaboration.MdaTypes.SWACCESSSERVICE_COLLABORATION_ISMODIFIER_TAGTYPE_ELT);
    }

    protected SwAccessServiceCollaboration(final Collaboration elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWACCESSSERVICE_COLLABORATION_ISMODIFIER_TAGTYPE_ELT;

        public static TagType SWACCESSSERVICE_COLLABORATION_ACCESSEDELEMENT_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01a7eb01-0ccf-11df-8525-001302895b2b");
            SWACCESSSERVICE_COLLABORATION_ISMODIFIER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a7eb07-0ccf-11df-8525-001302895b2b");
            SWACCESSSERVICE_COLLABORATION_ACCESSEDELEMENT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a7eb0d-0ccf-11df-8525-001302895b2b");
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
