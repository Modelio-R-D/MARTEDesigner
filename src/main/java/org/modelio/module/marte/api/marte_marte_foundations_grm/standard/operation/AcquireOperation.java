/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.operation;

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
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Operation} with << Acquire_Operation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class AcquireOperation extends GrServiceOperation {
    public static final String STEREOTYPE_NAME = "Acquire_Operation";

    public static final String ACQUIRE_OPERATION_ISBLOCKING_TAGTYPE = "Acquire_Operation_isBlocking";

    /**
     * Tells whether a {@link AcquireOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link Operation} stereotyped << Acquire_Operation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Operation) && ((Operation) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AcquireOperation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Operation} stereotyped << Acquire_Operation >> then instantiate a {@link AcquireOperation} proxy.
     * 
     * @return a {@link AcquireOperation} proxy on the created {@link Operation}.
     */
    public static AcquireOperation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Operation");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AcquireOperation.STEREOTYPE_NAME);
        return AcquireOperation.instantiate((Operation)e);
    }

    /**
     * Tries to instantiate a {@link AcquireOperation} proxy from a {@link Operation} stereotyped << Acquire_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Operation
     * @return a {@link AcquireOperation} proxy or <i>null</i>.
     */
    public static AcquireOperation instantiate(final Operation obj) {
        return AcquireOperation.canInstantiate(obj) ? new AcquireOperation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AcquireOperation} proxy from a {@link Operation} stereotyped << Acquire_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Operation}
     * @return a {@link AcquireOperation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static AcquireOperation safeInstantiate(final Operation obj) throws IllegalArgumentException {
        if (AcquireOperation.canInstantiate(obj))
        	return new AcquireOperation(obj);
        else
        	throw new IllegalArgumentException("AcquireOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        AcquireOperation other = (AcquireOperation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Operation}. 
     * @return the Operation represented by this proxy, never null.
     */
    @Override
    public Operation getElement() {
        return (Operation)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Acquire_Operation_isBlocking'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isAcquire_Operation_isBlocking() {
        return this.elt.isTagged(AcquireOperation.MdaTypes.ACQUIRE_OPERATION_ISBLOCKING_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Acquire_Operation_isBlocking'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setAcquire_Operation_isBlocking(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(AcquireOperation.MdaTypes.ACQUIRE_OPERATION_ISBLOCKING_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(AcquireOperation.MdaTypes.ACQUIRE_OPERATION_ISBLOCKING_TAGTYPE_ELT);
    }

    protected AcquireOperation(final Operation elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType ACQUIRE_OPERATION_ISBLOCKING_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00ab3510-0ccf-11df-8525-001302895b2b");
            ACQUIRE_OPERATION_ISBLOCKING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00ad975e-0ccf-11df-8525-001302895b2b");
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
