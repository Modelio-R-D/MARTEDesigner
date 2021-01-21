/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.bindableinstance;

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
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link BindableInstance} with << FlowProperty_BindableInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ad74548b-8cea-4c22-a0a8-3edfcfa64e4a")
public class FlowPropertyBindableInstance {
    @objid ("118d1dc1-d6b8-4275-b831-aceaded78b92")
    public static final String STEREOTYPE_NAME = "FlowProperty_BindableInstance";

    @objid ("43cadd6e-b62f-4646-80c6-3e3857803a6a")
    public static final String FLOWPROPERTY_BINDABLEINSTANCE_DIRECTION_TAGTYPE = "FlowProperty_BindableInstance_direction";

    /**
     * The underlying {@link BindableInstance} represented by this proxy, never null.
     */
    @objid ("478c4af7-7e1d-40fe-b613-108eb651bea2")
    protected final BindableInstance elt;

    /**
     * Tells whether a {@link FlowPropertyBindableInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link BindableInstance} stereotyped << FlowProperty_BindableInstance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("a090b132-6541-44bc-b526-1de4772899b4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof BindableInstance) && ((BindableInstance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, FlowPropertyBindableInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link BindableInstance} stereotyped << FlowProperty_BindableInstance >> then instantiate a {@link FlowPropertyBindableInstance} proxy.
     * 
     * @return a {@link FlowPropertyBindableInstance} proxy on the created {@link BindableInstance}.
     */
    @objid ("aa87eec8-e16a-466c-9821-a1e573ebc1ff")
    public static FlowPropertyBindableInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("BindableInstance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, FlowPropertyBindableInstance.STEREOTYPE_NAME);
        return FlowPropertyBindableInstance.instantiate((BindableInstance)e);
    }

    /**
     * Tries to instantiate a {@link FlowPropertyBindableInstance} proxy from a {@link BindableInstance} stereotyped << FlowProperty_BindableInstance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a BindableInstance
     * @return a {@link FlowPropertyBindableInstance} proxy or <i>null</i>.
     */
    @objid ("5bf4eca4-6cfa-43fe-96a1-166bbf926d2c")
    public static FlowPropertyBindableInstance instantiate(final BindableInstance obj) {
        return FlowPropertyBindableInstance.canInstantiate(obj) ? new FlowPropertyBindableInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FlowPropertyBindableInstance} proxy from a {@link BindableInstance} stereotyped << FlowProperty_BindableInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link BindableInstance}
     * @return a {@link FlowPropertyBindableInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a1064bd4-c584-445d-b53a-b871875318ec")
    public static FlowPropertyBindableInstance safeInstantiate(final BindableInstance obj) throws IllegalArgumentException {
        if (FlowPropertyBindableInstance.canInstantiate(obj))
        	return new FlowPropertyBindableInstance(obj);
        else
        	throw new IllegalArgumentException("FlowPropertyBindableInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5ecc2dae-4124-4c43-8d14-6712256a40c7")
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
        FlowPropertyBindableInstance other = (FlowPropertyBindableInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link BindableInstance}. 
     * @return the BindableInstance represented by this proxy, never null.
     */
    @objid ("d957449e-97a9-4db5-bae7-e3181da5ecc0")
    public BindableInstance getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'FlowProperty_BindableInstance_direction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1ca98cc2-4a99-4a1c-b4ad-e0ea45984010")
    public String getFlowProperty_BindableInstance_direction() {
        return this.elt.getTagValue(FlowPropertyBindableInstance.MdaTypes.FLOWPROPERTY_BINDABLEINSTANCE_DIRECTION_TAGTYPE_ELT);
    }

    @objid ("3c24dbb4-5dcf-44f9-896f-4b57f5a52d71")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'FlowProperty_BindableInstance_direction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b096fb37-277d-487a-85dd-90b559924fc8")
    public void setFlowProperty_BindableInstance_direction(final String value) {
        this.elt.putTagValue(FlowPropertyBindableInstance.MdaTypes.FLOWPROPERTY_BINDABLEINSTANCE_DIRECTION_TAGTYPE_ELT, value);
    }

    @objid ("cae8d75f-3965-4340-b712-187b97f785d9")
    protected FlowPropertyBindableInstance(final BindableInstance elt) {
        this.elt = elt;
    }

    @objid ("c98929dc-39ae-42d7-8983-36dec9258530")
    public static final class MdaTypes {
        @objid ("a15b6a40-9d59-4c2a-b366-a8d00c19b9fe")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2b9b6a1b-6e77-4ff7-9ab6-0f74d8dc81c5")
        public static TagType FLOWPROPERTY_BINDABLEINSTANCE_DIRECTION_TAGTYPE_ELT;

        @objid ("a5fb62f4-7458-477f-8081-b33f36629987")
        private static Stereotype MDAASSOCDEP;

        @objid ("b5ffdd82-17b5-45ac-87d5-9985d791acca")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cd2d6d6c-08f6-4c4a-a5f4-bf3b4e532a7b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0247a677-0ccf-11df-8525-001302895b2b");
            FLOWPROPERTY_BINDABLEINSTANCE_DIRECTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0247a67a-0ccf-11df-8525-001302895b2b");
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
