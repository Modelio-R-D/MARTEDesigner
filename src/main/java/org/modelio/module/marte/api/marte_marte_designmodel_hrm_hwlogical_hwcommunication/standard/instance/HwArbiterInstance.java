/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwArbiter_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwArbiterInstance extends HwCommunicationResourceInstance {
    public static final String STEREOTYPE_NAME = "HwArbiter_Instance";

    public static final String HWARBITER_INSTANCE_CONTROLLEDMEDIAS_TAGTYPE = "HwArbiter_Instance_controlledMedias";

    /**
     * Tells whether a {@link HwArbiterInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwArbiter_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwArbiterInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwArbiter_Instance >> then instantiate a {@link HwArbiterInstance} proxy.
     * 
     * @return a {@link HwArbiterInstance} proxy on the created {@link Instance}.
     */
    public static HwArbiterInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwArbiterInstance.STEREOTYPE_NAME);
        return HwArbiterInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwArbiterInstance} proxy from a {@link Instance} stereotyped << HwArbiter_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwArbiterInstance} proxy or <i>null</i>.
     */
    public static HwArbiterInstance instantiate(final Instance obj) {
        return HwArbiterInstance.canInstantiate(obj) ? new HwArbiterInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwArbiterInstance} proxy from a {@link Instance} stereotyped << HwArbiter_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwArbiterInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwArbiterInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwArbiterInstance.canInstantiate(obj))
        	return new HwArbiterInstance(obj);
        else
        	throw new IllegalArgumentException("HwArbiterInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwArbiterInstance other = (HwArbiterInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwArbiter_Instance_controlledMedias'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwArbiter_Instance_controlledMedias() {
        return this.elt.getTagValues(HwArbiterInstance.MdaTypes.HWARBITER_INSTANCE_CONTROLLEDMEDIAS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwArbiter_Instance_controlledMedias'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwArbiter_Instance_controlledMedias(final List<String> values) {
        this.elt.putTagValues(HwArbiterInstance.MdaTypes.HWARBITER_INSTANCE_CONTROLLEDMEDIAS_TAGTYPE_ELT, values);
    }

    protected HwArbiterInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWARBITER_INSTANCE_CONTROLLEDMEDIAS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01036aeb-0ccf-11df-8525-001302895b2b");
            HWARBITER_INSTANCE_CONTROLLEDMEDIAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01036af2-0ccf-11df-8525-001302895b2b");
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
