/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.collaborationuse;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link CollaborationUse} with << GrService_CollaborationUse >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GrServiceCollaborationUse {
    public static final String STEREOTYPE_NAME = "GrService_CollaborationUse";

    public static final String GRSERVICE_COLLABORATIONUSE_OWNER_TAGTYPE = "GrService_CollaborationUse_owner";

    /**
     * The underlying {@link CollaborationUse} represented by this proxy, never null.
     */
    protected final CollaborationUse elt;

    /**
     * Tells whether a {@link GrServiceCollaborationUse proxy} can be instantiated from a {@link MObject} checking it is a {@link CollaborationUse} stereotyped << GrService_CollaborationUse >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof CollaborationUse) && ((CollaborationUse) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GrServiceCollaborationUse.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link CollaborationUse} stereotyped << GrService_CollaborationUse >> then instantiate a {@link GrServiceCollaborationUse} proxy.
     * 
     * @return a {@link GrServiceCollaborationUse} proxy on the created {@link CollaborationUse}.
     */
    public static GrServiceCollaborationUse create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.CollaborationUse");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GrServiceCollaborationUse.STEREOTYPE_NAME);
        return GrServiceCollaborationUse.instantiate((CollaborationUse)e);
    }

    /**
     * Tries to instantiate a {@link GrServiceCollaborationUse} proxy from a {@link CollaborationUse} stereotyped << GrService_CollaborationUse >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a CollaborationUse
     * @return a {@link GrServiceCollaborationUse} proxy or <i>null</i>.
     */
    public static GrServiceCollaborationUse instantiate(final CollaborationUse obj) {
        return GrServiceCollaborationUse.canInstantiate(obj) ? new GrServiceCollaborationUse(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GrServiceCollaborationUse} proxy from a {@link CollaborationUse} stereotyped << GrService_CollaborationUse >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link CollaborationUse}
     * @return a {@link GrServiceCollaborationUse} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GrServiceCollaborationUse safeInstantiate(final CollaborationUse obj) throws IllegalArgumentException {
        if (GrServiceCollaborationUse.canInstantiate(obj))
        	return new GrServiceCollaborationUse(obj);
        else
        	throw new IllegalArgumentException("GrServiceCollaborationUse: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GrServiceCollaborationUse other = (GrServiceCollaborationUse) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link CollaborationUse}. 
     * @return the CollaborationUse represented by this proxy, never null.
     */
    public CollaborationUse getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'GrService_CollaborationUse_owner'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGrService_CollaborationUse_owner() {
        return this.elt.getTagValue(GrServiceCollaborationUse.MdaTypes.GRSERVICE_COLLABORATIONUSE_OWNER_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GrService_CollaborationUse_owner'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGrService_CollaborationUse_owner(final String value) {
        this.elt.putTagValue(GrServiceCollaborationUse.MdaTypes.GRSERVICE_COLLABORATIONUSE_OWNER_TAGTYPE_ELT, value);
    }

    protected GrServiceCollaborationUse(final CollaborationUse elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GRSERVICE_COLLABORATIONUSE_OWNER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00a8d2ba-0ccf-11df-8525-001302895b2b");
            GRSERVICE_COLLABORATIONUSE_OWNER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00a8d2bd-0ccf-11df-8525-001302895b2b");
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
