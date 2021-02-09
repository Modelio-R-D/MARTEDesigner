/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.collaboration;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Collaboration} with << GrService_Collaboration >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GrServiceCollaboration {
    public static final String STEREOTYPE_NAME = "GrService_Collaboration";

    public static final String GRSERVICE_COLLABORATION_OWNER_TAGTYPE = "GrService_Collaboration_owner";

    /**
     * The underlying {@link Collaboration} represented by this proxy, never null.
     */
    protected final Collaboration elt;

    /**
     * Tells whether a {@link GrServiceCollaboration proxy} can be instantiated from a {@link MObject} checking it is a {@link Collaboration} stereotyped << GrService_Collaboration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Collaboration) && ((Collaboration) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GrServiceCollaboration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Collaboration} stereotyped << GrService_Collaboration >> then instantiate a {@link GrServiceCollaboration} proxy.
     * 
     * @return a {@link GrServiceCollaboration} proxy on the created {@link Collaboration}.
     */
    public static GrServiceCollaboration create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Collaboration");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GrServiceCollaboration.STEREOTYPE_NAME);
        return GrServiceCollaboration.instantiate((Collaboration)e);
    }

    /**
     * Tries to instantiate a {@link GrServiceCollaboration} proxy from a {@link Collaboration} stereotyped << GrService_Collaboration >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Collaboration
     * @return a {@link GrServiceCollaboration} proxy or <i>null</i>.
     */
    public static GrServiceCollaboration instantiate(final Collaboration obj) {
        return GrServiceCollaboration.canInstantiate(obj) ? new GrServiceCollaboration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GrServiceCollaboration} proxy from a {@link Collaboration} stereotyped << GrService_Collaboration >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Collaboration}
     * @return a {@link GrServiceCollaboration} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GrServiceCollaboration safeInstantiate(final Collaboration obj) throws IllegalArgumentException {
        if (GrServiceCollaboration.canInstantiate(obj))
        	return new GrServiceCollaboration(obj);
        else
        	throw new IllegalArgumentException("GrServiceCollaboration: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GrServiceCollaboration other = (GrServiceCollaboration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Collaboration}. 
     * @return the Collaboration represented by this proxy, never null.
     */
    public Collaboration getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'GrService_Collaboration_owner'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGrService_Collaboration_owner() {
        return this.elt.getTagValue(GrServiceCollaboration.MdaTypes.GRSERVICE_COLLABORATION_OWNER_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GrService_Collaboration_owner'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGrService_Collaboration_owner(final String value) {
        this.elt.putTagValue(GrServiceCollaboration.MdaTypes.GRSERVICE_COLLABORATION_OWNER_TAGTYPE_ELT, value);
    }

    protected GrServiceCollaboration(final Collaboration elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GRSERVICE_COLLABORATION_OWNER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00a67068-0ccf-11df-8525-001302895b2b");
            GRSERVICE_COLLABORATION_OWNER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00a8d2bc-0ccf-11df-8525-001302895b2b");
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
