/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.executionspecification;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
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
 * Proxy class to handle a {@link ExecutionSpecification} with << Acquire_ExecutionSpecification >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("81247220-9ddc-4452-8caa-c28632a3bf70")
public class AcquireExecutionSpecification extends GrServiceExecutionSpecification {
    @objid ("ee905ffc-3428-4703-9cec-23712548b951")
    public static final String STEREOTYPE_NAME = "Acquire_ExecutionSpecification";

    @objid ("4c145c00-3c30-4048-98e0-46179c8faadc")
    public static final String ACQUIRE_EXECUTIONSPECIFICATION_ISBLOCKING_TAGTYPE = "Acquire_ExecutionSpecification_isBlocking";

    /**
     * Tells whether a {@link AcquireExecutionSpecification proxy} can be instantiated from a {@link MObject} checking it is a {@link ExecutionSpecification} stereotyped << Acquire_ExecutionSpecification >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e6dc47bc-c26d-49c7-a793-21550d3275c0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ExecutionSpecification) && ((ExecutionSpecification) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AcquireExecutionSpecification.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ExecutionSpecification} stereotyped << Acquire_ExecutionSpecification >> then instantiate a {@link AcquireExecutionSpecification} proxy.
     * 
     * @return a {@link AcquireExecutionSpecification} proxy on the created {@link ExecutionSpecification}.
     */
    @objid ("bd3e0232-ac1e-4108-ae29-f69731786f3b")
    public static AcquireExecutionSpecification create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ExecutionSpecification");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AcquireExecutionSpecification.STEREOTYPE_NAME);
        return AcquireExecutionSpecification.instantiate((ExecutionSpecification)e);
    }

    /**
     * Tries to instantiate a {@link AcquireExecutionSpecification} proxy from a {@link ExecutionSpecification} stereotyped << Acquire_ExecutionSpecification >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ExecutionSpecification
     * @return a {@link AcquireExecutionSpecification} proxy or <i>null</i>.
     */
    @objid ("8c443dea-8c1c-4bab-8053-2d514ab2cb9c")
    public static AcquireExecutionSpecification instantiate(final ExecutionSpecification obj) {
        return AcquireExecutionSpecification.canInstantiate(obj) ? new AcquireExecutionSpecification(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AcquireExecutionSpecification} proxy from a {@link ExecutionSpecification} stereotyped << Acquire_ExecutionSpecification >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ExecutionSpecification}
     * @return a {@link AcquireExecutionSpecification} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("aadeef90-efb3-4b7c-b2c8-4e4e8b1fb04c")
    public static AcquireExecutionSpecification safeInstantiate(final ExecutionSpecification obj) throws IllegalArgumentException {
        if (AcquireExecutionSpecification.canInstantiate(obj))
        	return new AcquireExecutionSpecification(obj);
        else
        	throw new IllegalArgumentException("AcquireExecutionSpecification: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fa4b2e58-4f7b-4f4e-9607-447687dd20a2")
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
        AcquireExecutionSpecification other = (AcquireExecutionSpecification) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ExecutionSpecification}. 
     * @return the ExecutionSpecification represented by this proxy, never null.
     */
    @objid ("f7a66991-212d-44a5-8777-58c9045093e9")
    @Override
    public ExecutionSpecification getElement() {
        return (ExecutionSpecification)super.getElement();
    }

    @objid ("3db36321-4b80-45d8-ae0a-bca8c947f229")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Acquire_ExecutionSpecification_isBlocking'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2421fb02-c554-4b61-8774-b951451a0691")
    public boolean isAcquire_ExecutionSpecification_isBlocking() {
        return this.elt.isTagged(AcquireExecutionSpecification.MdaTypes.ACQUIRE_EXECUTIONSPECIFICATION_ISBLOCKING_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Acquire_ExecutionSpecification_isBlocking'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a60b6264-8e40-4efb-afee-7315d8eb6010")
    public void setAcquire_ExecutionSpecification_isBlocking(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(AcquireExecutionSpecification.MdaTypes.ACQUIRE_EXECUTIONSPECIFICATION_ISBLOCKING_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(AcquireExecutionSpecification.MdaTypes.ACQUIRE_EXECUTIONSPECIFICATION_ISBLOCKING_TAGTYPE_ELT);
    }

    @objid ("b8aae557-ce2c-456e-a1f2-a8e4e2cef579")
    protected AcquireExecutionSpecification(final ExecutionSpecification elt) {
        super(elt);
    }

    @objid ("46aef918-ecc3-4f36-8494-e59f6e5f8be9")
    public static final class MdaTypes {
        @objid ("7201c34d-e6a5-4422-af78-11f19f51ad8d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("112906bd-1fcc-4165-a6b1-0fb30f556d96")
        public static TagType ACQUIRE_EXECUTIONSPECIFICATION_ISBLOCKING_TAGTYPE_ELT;

        @objid ("58e7a358-7839-4499-ae90-a24e30157d85")
        private static Stereotype MDAASSOCDEP;

        @objid ("5852db6d-8796-4151-8fc4-22b8c97c80e4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e11ea1d1-96fd-4a0a-9842-1733327fcc82")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00ab350f-0ccf-11df-8525-001302895b2b");
            ACQUIRE_EXECUTIONSPECIFICATION_ISBLOCKING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00ab3512-0ccf-11df-8525-001302895b2b");
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
