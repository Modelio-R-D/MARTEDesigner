/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.collaborationuse;

import java.util.ArrayList;
import java.util.Collections;
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
@objid ("040f4635-0ed9-4261-ad2d-5b5a2519214c")
public class AcquireCollaborationUse extends GrServiceCollaborationUse {
    @objid ("6de0366d-a66c-446e-9115-3aa056b28391")
    public static final String STEREOTYPE_NAME = "Acquire_CollaborationUse";

    @objid ("aaa17a9e-54c3-4ac7-9ae1-bd8ee5e23909")
    public static final String ACQUIRE_COLLABORATIONUSE_ISBLOCKING_TAGTYPE = "Acquire_CollaborationUse_isBlocking";

    /**
     * Tells whether a {@link AcquireCollaborationUse proxy} can be instantiated from a {@link MObject} checking it is a {@link CollaborationUse} stereotyped << Acquire_CollaborationUse >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("575a3175-1d83-44ad-9c5b-4629aab83723")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof CollaborationUse) && ((CollaborationUse) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AcquireCollaborationUse.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link CollaborationUse} stereotyped << Acquire_CollaborationUse >> then instantiate a {@link AcquireCollaborationUse} proxy.
     * 
     * @return a {@link AcquireCollaborationUse} proxy on the created {@link CollaborationUse}.
     */
    @objid ("014fc687-7c46-444b-ad67-dfa5f7105c89")
    public static AcquireCollaborationUse create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("CollaborationUse");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AcquireCollaborationUse.STEREOTYPE_NAME);
        return AcquireCollaborationUse.instantiate((CollaborationUse)e);
    }

    /**
     * Tries to instantiate a {@link AcquireCollaborationUse} proxy from a {@link CollaborationUse} stereotyped << Acquire_CollaborationUse >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a CollaborationUse
     * @return a {@link AcquireCollaborationUse} proxy or <i>null</i>.
     */
    @objid ("0a8bdaf6-5e4d-4007-9d67-5add645cc4fc")
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
    @objid ("34688fd3-2692-472c-9b3e-e9e1ca19f910")
    public static AcquireCollaborationUse safeInstantiate(final CollaborationUse obj) throws IllegalArgumentException {
        if (AcquireCollaborationUse.canInstantiate(obj))
        	return new AcquireCollaborationUse(obj);
        else
        	throw new IllegalArgumentException("AcquireCollaborationUse: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0ec7267b-6dd5-4907-97db-c1ceec3b389c")
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
    @objid ("b7aeb2be-45cc-49d1-92ac-bcfcbd34cd3a")
    @Override
    public CollaborationUse getElement() {
        return (CollaborationUse)super.getElement();
    }

    @objid ("b98bfd41-7b70-4871-9793-f0422b042886")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Acquire_CollaborationUse_isBlocking'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e6829909-e694-431e-a999-649cd536f9a6")
    public boolean isAcquire_CollaborationUse_isBlocking() {
        return this.elt.isTagged(AcquireCollaborationUse.MdaTypes.ACQUIRE_COLLABORATIONUSE_ISBLOCKING_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Acquire_CollaborationUse_isBlocking'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("116eaf1a-c446-49fc-8610-60d1db906e29")
    public void setAcquire_CollaborationUse_isBlocking(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(AcquireCollaborationUse.MdaTypes.ACQUIRE_COLLABORATIONUSE_ISBLOCKING_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(AcquireCollaborationUse.MdaTypes.ACQUIRE_COLLABORATIONUSE_ISBLOCKING_TAGTYPE_ELT);
    }

    @objid ("2de19b1e-d4a5-45fe-9f8b-f8a8ead99018")
    protected AcquireCollaborationUse(final CollaborationUse elt) {
        super(elt);
    }

    @objid ("3bbc366a-bb8b-4a56-bc07-afcab32ece1d")
    public static final class MdaTypes {
        @objid ("96671b05-d1d4-4f73-ab2d-059a834ba73a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e86ba596-0045-4407-9e71-f8919f792973")
        public static TagType ACQUIRE_COLLABORATIONUSE_ISBLOCKING_TAGTYPE_ELT;

        @objid ("9a8526cb-c424-4533-a398-03337082a0a3")
        private static Stereotype MDAASSOCDEP;

        @objid ("e3413ea2-29bc-4d81-9536-8a637a314900")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9103fc9b-eb0f-42f8-b30d-c5c452c75d86")
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
