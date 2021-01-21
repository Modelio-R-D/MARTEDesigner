/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.collaboration;

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
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Collaboration} with << Acquire_Collaboration >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ac4a9b82-fea3-47fd-9d41-4e7f01b7b8a0")
public class AcquireCollaboration extends GrServiceCollaboration {
    @objid ("538a959c-3fe6-4814-bba5-6a9b7777e3d6")
    public static final String STEREOTYPE_NAME = "Acquire_Collaboration";

    @objid ("8382b314-4ebd-4732-9066-0cd8d8a806e6")
    public static final String ACQUIRE_COLLABORATION_ISBLOCKING_TAGTYPE = "Acquire_Collaboration_isBlocking";

    /**
     * Tells whether a {@link AcquireCollaboration proxy} can be instantiated from a {@link MObject} checking it is a {@link Collaboration} stereotyped << Acquire_Collaboration >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("dc4af655-98ea-4829-9c47-04dc2cfcf56f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Collaboration) && ((Collaboration) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AcquireCollaboration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Collaboration} stereotyped << Acquire_Collaboration >> then instantiate a {@link AcquireCollaboration} proxy.
     * 
     * @return a {@link AcquireCollaboration} proxy on the created {@link Collaboration}.
     */
    @objid ("9db4256e-ef03-4b87-aa24-042359013ef0")
    public static AcquireCollaboration create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Collaboration");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AcquireCollaboration.STEREOTYPE_NAME);
        return AcquireCollaboration.instantiate((Collaboration)e);
    }

    /**
     * Tries to instantiate a {@link AcquireCollaboration} proxy from a {@link Collaboration} stereotyped << Acquire_Collaboration >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Collaboration
     * @return a {@link AcquireCollaboration} proxy or <i>null</i>.
     */
    @objid ("ed41fadc-9fa5-4e28-9f47-fa280ad125b5")
    public static AcquireCollaboration instantiate(final Collaboration obj) {
        return AcquireCollaboration.canInstantiate(obj) ? new AcquireCollaboration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AcquireCollaboration} proxy from a {@link Collaboration} stereotyped << Acquire_Collaboration >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Collaboration}
     * @return a {@link AcquireCollaboration} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("81801061-49f6-4b36-804b-32090fd7fc19")
    public static AcquireCollaboration safeInstantiate(final Collaboration obj) throws IllegalArgumentException {
        if (AcquireCollaboration.canInstantiate(obj))
        	return new AcquireCollaboration(obj);
        else
        	throw new IllegalArgumentException("AcquireCollaboration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("365ca594-4be7-4d19-aa6b-02c39be96e28")
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
        AcquireCollaboration other = (AcquireCollaboration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Collaboration}. 
     * @return the Collaboration represented by this proxy, never null.
     */
    @objid ("07409f36-50a3-4fbd-9491-d17c278864f7")
    @Override
    public Collaboration getElement() {
        return (Collaboration)super.getElement();
    }

    @objid ("610dd1c1-cf0a-42fd-b322-d734b55fd9e7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Acquire_Collaboration_isBlocking'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("906d17d1-c17d-49ed-9cdb-6139dd291621")
    public boolean isAcquire_Collaboration_isBlocking() {
        return this.elt.isTagged(AcquireCollaboration.MdaTypes.ACQUIRE_COLLABORATION_ISBLOCKING_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Acquire_Collaboration_isBlocking'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("76b8cbf6-a456-4aa9-a9c8-63cb97cffc2e")
    public void setAcquire_Collaboration_isBlocking(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(AcquireCollaboration.MdaTypes.ACQUIRE_COLLABORATION_ISBLOCKING_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(AcquireCollaboration.MdaTypes.ACQUIRE_COLLABORATION_ISBLOCKING_TAGTYPE_ELT);
    }

    @objid ("33c7b475-ee48-4592-a511-d57a02002e49")
    protected AcquireCollaboration(final Collaboration elt) {
        super(elt);
    }

    @objid ("1b99eb6b-85b8-418c-8402-4f8bef2cf3d8")
    public static final class MdaTypes {
        @objid ("17e8f4d3-9cbc-4c43-8e7f-aafc64587b7c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ad981f67-6982-4794-8112-727e601346ad")
        public static TagType ACQUIRE_COLLABORATION_ISBLOCKING_TAGTYPE_ELT;

        @objid ("cf852842-61c1-4b0b-b8fe-40cc9fda88d0")
        private static Stereotype MDAASSOCDEP;

        @objid ("e342d69f-f6d2-4739-b535-1d3f1e2ef088")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9e63b3b9-d7f3-4fa9-adaa-f4ac640a7aa1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fa7abed4-0f30-11df-8c52-0014222a9f79");
            ACQUIRE_COLLABORATION_ISBLOCKING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "43cb839b-0f33-11df-8c52-0014222a9f79");
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
