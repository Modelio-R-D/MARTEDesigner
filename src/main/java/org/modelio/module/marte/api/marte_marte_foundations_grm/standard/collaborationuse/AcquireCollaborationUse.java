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
 * Proxy class to handle a {@link CollaborationUse} with << Acquire_CollaborationUse >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class AcquireCollaborationUse extends GrServiceCollaborationUse {
    public static final String STEREOTYPE_NAME = "Acquire_CollaborationUse";

    public static final String ACQUIRE_COLLABORATIONUSE_ISBLOCKING_TAGTYPE = "Acquire_CollaborationUse_isBlocking";

    /**
     * Tells whether a {@link AcquireCollaborationUse proxy} can be instantiated from a {@link MObject} checking it is a {@link CollaborationUse} stereotyped << Acquire_CollaborationUse >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof CollaborationUse) && ((CollaborationUse) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AcquireCollaborationUse.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link CollaborationUse} stereotyped << Acquire_CollaborationUse >> then instantiate a {@link AcquireCollaborationUse} proxy.
     * 
     * @return a {@link AcquireCollaborationUse} proxy on the created {@link CollaborationUse}.
     */
    public static AcquireCollaborationUse create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.CollaborationUse");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AcquireCollaborationUse.STEREOTYPE_NAME);
        return AcquireCollaborationUse.instantiate((CollaborationUse)e);
    }

    /**
     * Tries to instantiate a {@link AcquireCollaborationUse} proxy from a {@link CollaborationUse} stereotyped << Acquire_CollaborationUse >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a CollaborationUse
     * @return a {@link AcquireCollaborationUse} proxy or <i>null</i>.
     */
    public static AcquireCollaborationUse instantiate(final CollaborationUse obj) {
        return AcquireCollaborationUse.canInstantiate(obj) ? new AcquireCollaborationUse(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AcquireCollaborationUse} proxy from a {@link CollaborationUse} stereotyped << Acquire_CollaborationUse >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link CollaborationUse}
     * @return a {@link AcquireCollaborationUse} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static AcquireCollaborationUse safeInstantiate(final CollaborationUse obj) throws IllegalArgumentException {
        if (AcquireCollaborationUse.canInstantiate(obj))
        	return new AcquireCollaborationUse(obj);
        else
        	throw new IllegalArgumentException("AcquireCollaborationUse: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        AcquireCollaborationUse other = (AcquireCollaborationUse) obj;
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

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Acquire_CollaborationUse_isBlocking'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isAcquire_CollaborationUse_isBlocking() {
        return this.elt.isTagged(AcquireCollaborationUse.MdaTypes.ACQUIRE_COLLABORATIONUSE_ISBLOCKING_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Acquire_CollaborationUse_isBlocking'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setAcquire_CollaborationUse_isBlocking(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(AcquireCollaborationUse.MdaTypes.ACQUIRE_COLLABORATIONUSE_ISBLOCKING_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(AcquireCollaborationUse.MdaTypes.ACQUIRE_COLLABORATIONUSE_ISBLOCKING_TAGTYPE_ELT);
    }

    protected AcquireCollaborationUse(final CollaborationUse elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType ACQUIRE_COLLABORATIONUSE_ISBLOCKING_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "09f30137-0f31-11df-8c52-0014222a9f79");
            ACQUIRE_COLLABORATIONUSE_ISBLOCKING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4af2919b-0f33-11df-8c52-0014222a9f79");
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
