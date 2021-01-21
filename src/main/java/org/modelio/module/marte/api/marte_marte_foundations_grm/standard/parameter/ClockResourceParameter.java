/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << ClockResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("20258ed3-e41a-46d0-bc25-0ec0234b8118")
public class ClockResourceParameter extends TimingResourceParameter {
    @objid ("4ff68030-0d9e-4604-8b34-c94f99ab6c7e")
    public static final String STEREOTYPE_NAME = "ClockResource_Parameter";

    /**
     * Tells whether a {@link ClockResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << ClockResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2720ac1d-7bec-44ae-89df-ee2cff2c9897")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClockResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << ClockResource_Parameter >> then instantiate a {@link ClockResourceParameter} proxy.
     * 
     * @return a {@link ClockResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("ff9a2097-7429-48ef-901b-db4a09d82101")
    public static ClockResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClockResourceParameter.STEREOTYPE_NAME);
        return ClockResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link ClockResourceParameter} proxy from a {@link Parameter} stereotyped << ClockResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link ClockResourceParameter} proxy or <i>null</i>.
     */
    @objid ("80f50840-cd5f-4e0a-9576-d7605f13889b")
    public static ClockResourceParameter instantiate(final Parameter obj) {
        return ClockResourceParameter.canInstantiate(obj) ? new ClockResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClockResourceParameter} proxy from a {@link Parameter} stereotyped << ClockResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link ClockResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d53dc594-6f4e-4adc-83a8-85f570e72a12")
    public static ClockResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (ClockResourceParameter.canInstantiate(obj))
        	return new ClockResourceParameter(obj);
        else
        	throw new IllegalArgumentException("ClockResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b97d6a00-521e-4826-83ef-9db650dd99d5")
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
        ClockResourceParameter other = (ClockResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("1c4aca51-ccd1-488e-96c7-6fe595f9ce6c")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    @objid ("b2b60150-a8e3-472c-b3b9-ef8f14cd54b7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("68cecbb9-7441-41a1-ae81-7456d4b2c2ef")
    protected ClockResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("67120ed9-fc42-4afd-9844-a0ccc4faab80")
    public static final class MdaTypes {
        @objid ("c46bffa8-0711-4719-8c8f-bed848a5b030")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ad9f86d6-c244-4a34-99d5-858071f84f81")
        private static Stereotype MDAASSOCDEP;

        @objid ("822ea91e-a237-4bfd-a799-debc593badc5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9b14117a-1969-4fb9-9e98-d4dcfe794668")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9eecfe99-0f2e-11df-8c52-0014222a9f79");
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
