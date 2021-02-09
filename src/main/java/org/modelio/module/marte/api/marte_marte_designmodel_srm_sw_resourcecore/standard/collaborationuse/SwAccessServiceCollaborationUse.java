/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.collaborationuse;

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
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.collaborationuse.GrServiceCollaborationUse;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link CollaborationUse} with << SwAccessService_CollaborationUse >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwAccessServiceCollaborationUse extends GrServiceCollaborationUse {
    public static final String STEREOTYPE_NAME = "SwAccessService_CollaborationUse";

    public static final String SWACCESSSERVICE_COLLABORATIONUSE_ACCESSEDELEMENT_TAGTYPE = "SwAccessService_CollaborationUse_accessedElement";

    public static final String SWACCESSSERVICE_COLLABORATIONUSE_ISMODIFIER_TAGTYPE = "SwAccessService_CollaborationUse_isModifier";

    /**
     * Tells whether a {@link SwAccessServiceCollaborationUse proxy} can be instantiated from a {@link MObject} checking it is a {@link CollaborationUse} stereotyped << SwAccessService_CollaborationUse >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof CollaborationUse) && ((CollaborationUse) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwAccessServiceCollaborationUse.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link CollaborationUse} stereotyped << SwAccessService_CollaborationUse >> then instantiate a {@link SwAccessServiceCollaborationUse} proxy.
     * 
     * @return a {@link SwAccessServiceCollaborationUse} proxy on the created {@link CollaborationUse}.
     */
    public static SwAccessServiceCollaborationUse create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.CollaborationUse");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwAccessServiceCollaborationUse.STEREOTYPE_NAME);
        return SwAccessServiceCollaborationUse.instantiate((CollaborationUse)e);
    }

    /**
     * Tries to instantiate a {@link SwAccessServiceCollaborationUse} proxy from a {@link CollaborationUse} stereotyped << SwAccessService_CollaborationUse >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a CollaborationUse
     * @return a {@link SwAccessServiceCollaborationUse} proxy or <i>null</i>.
     */
    public static SwAccessServiceCollaborationUse instantiate(final CollaborationUse obj) {
        return SwAccessServiceCollaborationUse.canInstantiate(obj) ? new SwAccessServiceCollaborationUse(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwAccessServiceCollaborationUse} proxy from a {@link CollaborationUse} stereotyped << SwAccessService_CollaborationUse >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link CollaborationUse}
     * @return a {@link SwAccessServiceCollaborationUse} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwAccessServiceCollaborationUse safeInstantiate(final CollaborationUse obj) throws IllegalArgumentException {
        if (SwAccessServiceCollaborationUse.canInstantiate(obj))
        	return new SwAccessServiceCollaborationUse(obj);
        else
        	throw new IllegalArgumentException("SwAccessServiceCollaborationUse: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwAccessServiceCollaborationUse other = (SwAccessServiceCollaborationUse) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link CollaborationUse}. 
     * @return the CollaborationUse represented by this proxy, never null.
     */
    @Override
    public CollaborationUse getElement() {
        return (CollaborationUse)super.getElement();
    }

    /**
     * Getter for string property 'SwAccessService_CollaborationUse_accessedElement'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwAccessService_CollaborationUse_accessedElement() {
        return this.elt.getTagValue(SwAccessServiceCollaborationUse.MdaTypes.SWACCESSSERVICE_COLLABORATIONUSE_ACCESSEDELEMENT_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwAccessService_CollaborationUse_isModifier'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSwAccessService_CollaborationUse_isModifier() {
        return this.elt.isTagged(SwAccessServiceCollaborationUse.MdaTypes.SWACCESSSERVICE_COLLABORATIONUSE_ISMODIFIER_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SwAccessService_CollaborationUse_accessedElement'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwAccessService_CollaborationUse_accessedElement(final String value) {
        this.elt.putTagValue(SwAccessServiceCollaborationUse.MdaTypes.SWACCESSSERVICE_COLLABORATIONUSE_ACCESSEDELEMENT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwAccessService_CollaborationUse_isModifier'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwAccessService_CollaborationUse_isModifier(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwAccessServiceCollaborationUse.MdaTypes.SWACCESSSERVICE_COLLABORATIONUSE_ISMODIFIER_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwAccessServiceCollaborationUse.MdaTypes.SWACCESSSERVICE_COLLABORATIONUSE_ISMODIFIER_TAGTYPE_ELT);
    }

    protected SwAccessServiceCollaborationUse(final CollaborationUse elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWACCESSSERVICE_COLLABORATIONUSE_ISMODIFIER_TAGTYPE_ELT;

        public static TagType SWACCESSSERVICE_COLLABORATIONUSE_ACCESSEDELEMENT_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01a7eb02-0ccf-11df-8525-001302895b2b");
            SWACCESSSERVICE_COLLABORATIONUSE_ISMODIFIER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a7eb08-0ccf-11df-8525-001302895b2b");
            SWACCESSSERVICE_COLLABORATIONUSE_ACCESSEDELEMENT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a7eb0e-0ccf-11df-8525-001302895b2b");
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
