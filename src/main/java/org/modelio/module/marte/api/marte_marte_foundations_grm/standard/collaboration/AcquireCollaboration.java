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
 * Proxy class to handle a {@link Collaboration} with << Acquire_Collaboration >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class AcquireCollaboration extends GrServiceCollaboration {
    public static final String STEREOTYPE_NAME = "Acquire_Collaboration";

    public static final String ACQUIRE_COLLABORATION_ISBLOCKING_TAGTYPE = "Acquire_Collaboration_isBlocking";

    /**
     * Tells whether a {@link AcquireCollaboration proxy} can be instantiated from a {@link MObject} checking it is a {@link Collaboration} stereotyped << Acquire_Collaboration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Collaboration) && ((Collaboration) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AcquireCollaboration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Collaboration} stereotyped << Acquire_Collaboration >> then instantiate a {@link AcquireCollaboration} proxy.
     * 
     * @return a {@link AcquireCollaboration} proxy on the created {@link Collaboration}.
     */
    public static AcquireCollaboration create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Collaboration");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AcquireCollaboration.STEREOTYPE_NAME);
        return AcquireCollaboration.instantiate((Collaboration)e);
    }

    /**
     * Tries to instantiate a {@link AcquireCollaboration} proxy from a {@link Collaboration} stereotyped << Acquire_Collaboration >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Collaboration
     * @return a {@link AcquireCollaboration} proxy or <i>null</i>.
     */
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
    public static AcquireCollaboration safeInstantiate(final Collaboration obj) throws IllegalArgumentException {
        if (AcquireCollaboration.canInstantiate(obj))
        	return new AcquireCollaboration(obj);
        else
        	throw new IllegalArgumentException("AcquireCollaboration: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        AcquireCollaboration other = (AcquireCollaboration) obj;
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

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Acquire_Collaboration_isBlocking'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isAcquire_Collaboration_isBlocking() {
        return this.elt.isTagged(AcquireCollaboration.MdaTypes.ACQUIRE_COLLABORATION_ISBLOCKING_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Acquire_Collaboration_isBlocking'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setAcquire_Collaboration_isBlocking(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(AcquireCollaboration.MdaTypes.ACQUIRE_COLLABORATION_ISBLOCKING_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(AcquireCollaboration.MdaTypes.ACQUIRE_COLLABORATION_ISBLOCKING_TAGTYPE_ELT);
    }

    protected AcquireCollaboration(final Collaboration elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType ACQUIRE_COLLABORATION_ISBLOCKING_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
