/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.behavior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Behavior} with << Acquire_Behavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("20274f46-0e9f-4629-8bbf-ae6cbe4b0c27")
public class AcquireBehavior extends GrServiceBehavior {
    @objid ("5512810c-fde1-43cf-afe9-61c049dc4d5d")
    public static final String STEREOTYPE_NAME = "Acquire_Behavior";

    @objid ("6dd64298-6398-4770-a247-85b8aae7b1e3")
    public static final String ACQUIRE_BEHAVIOR_ISBLOCKING_TAGTYPE = "Acquire_Behavior_isBlocking";

    /**
     * Tells whether a {@link AcquireBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Behavior} stereotyped << Acquire_Behavior >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e036a8a7-7e74-49ca-a786-694b8ed4a586")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Behavior) && ((Behavior) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AcquireBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Behavior} stereotyped << Acquire_Behavior >> then instantiate a {@link AcquireBehavior} proxy.
     * 
     * @return a {@link AcquireBehavior} proxy on the created {@link Behavior}.
     */
    @objid ("b554df41-0095-45f1-a5fc-b59cc3a0b3eb")
    public static AcquireBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Behavior");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AcquireBehavior.STEREOTYPE_NAME);
        return AcquireBehavior.instantiate((Behavior)e);
    }

    /**
     * Tries to instantiate a {@link AcquireBehavior} proxy from a {@link Behavior} stereotyped << Acquire_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Behavior
     * @return a {@link AcquireBehavior} proxy or <i>null</i>.
     */
    @objid ("1cb3f4a3-69de-492f-8e48-0ca6f915c8d7")
    public static AcquireBehavior instantiate(final Behavior obj) {
        return AcquireBehavior.canInstantiate(obj) ? new AcquireBehavior(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AcquireBehavior} proxy from a {@link Behavior} stereotyped << Acquire_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Behavior}
     * @return a {@link AcquireBehavior} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5913ce46-49d6-47fb-922c-2052c06a761b")
    public static AcquireBehavior safeInstantiate(final Behavior obj) throws IllegalArgumentException {
        if (AcquireBehavior.canInstantiate(obj))
        	return new AcquireBehavior(obj);
        else
        	throw new IllegalArgumentException("AcquireBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0572befd-e270-4417-9183-c7294a3233fb")
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
        AcquireBehavior other = (AcquireBehavior) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Behavior}. 
     * @return the Behavior represented by this proxy, never null.
     */
    @objid ("9a99b115-cc4b-4d67-8a64-17ffdd3051fc")
    @Override
    public Behavior getElement() {
        return (Behavior)super.getElement();
    }

    @objid ("85067fcf-01d7-474f-8082-c25475a148c7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Acquire_Behavior_isBlocking'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("34cd2361-8aba-4208-b009-c0c8bcbe3b84")
    public boolean isAcquire_Behavior_isBlocking() {
        return this.elt.isTagged(AcquireBehavior.MdaTypes.ACQUIRE_BEHAVIOR_ISBLOCKING_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Acquire_Behavior_isBlocking'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("90a1be48-e990-470c-bc2d-104112268407")
    public void setAcquire_Behavior_isBlocking(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(AcquireBehavior.MdaTypes.ACQUIRE_BEHAVIOR_ISBLOCKING_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(AcquireBehavior.MdaTypes.ACQUIRE_BEHAVIOR_ISBLOCKING_TAGTYPE_ELT);
    }

    @objid ("a8b4c431-77cb-45e9-a863-959c2ea295c2")
    protected AcquireBehavior(final Behavior elt) {
        super(elt);
    }

    @objid ("0ef510e2-15c2-4bd0-8890-d68d5e887bea")
    public static final class MdaTypes {
        @objid ("153e2288-4f6b-40fe-90f7-b75d0b861c7d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("217c7e7c-8d96-408c-b5d2-1a278aa49476")
        public static TagType ACQUIRE_BEHAVIOR_ISBLOCKING_TAGTYPE_ELT;

        @objid ("c96be7fd-d2c2-4e4d-b08c-521a34dfe68e")
        private static Stereotype MDAASSOCDEP;

        @objid ("c42430fe-2dcb-4410-bbc0-00fd9ae3ca04")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ef327e38-b771-4b90-83d5-091d2534e46b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00ab3511-0ccf-11df-8525-001302895b2b");
            ACQUIRE_BEHAVIOR_ISBLOCKING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00ad975f-0ccf-11df-8525-001302895b2b");
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
