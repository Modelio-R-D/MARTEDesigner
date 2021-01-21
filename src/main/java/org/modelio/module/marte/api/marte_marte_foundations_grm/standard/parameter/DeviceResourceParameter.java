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
 * Proxy class to handle a {@link Parameter} with << DeviceResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d04fc67c-f4b0-4b9e-a444-3818aa344d27")
public class DeviceResourceParameter extends ProcessingResourceParameter {
    @objid ("d74fb156-052a-4cf4-b5b0-902ae0e4ec50")
    public static final String STEREOTYPE_NAME = "DeviceResource_Parameter";

    /**
     * Tells whether a {@link DeviceResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << DeviceResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("a9e8efff-60ce-4d51-9dfb-1c233614a188")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << DeviceResource_Parameter >> then instantiate a {@link DeviceResourceParameter} proxy.
     * 
     * @return a {@link DeviceResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("9a365f80-7961-439f-b68b-84e8914d7d50")
    public static DeviceResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DeviceResourceParameter.STEREOTYPE_NAME);
        return DeviceResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link DeviceResourceParameter} proxy from a {@link Parameter} stereotyped << DeviceResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link DeviceResourceParameter} proxy or <i>null</i>.
     */
    @objid ("548982cb-6337-441f-a9bf-bf69f2cb7454")
    public static DeviceResourceParameter instantiate(final Parameter obj) {
        return DeviceResourceParameter.canInstantiate(obj) ? new DeviceResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeviceResourceParameter} proxy from a {@link Parameter} stereotyped << DeviceResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link DeviceResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("bfaab22a-c434-40ec-b14a-5bc8eb73631e")
    public static DeviceResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (DeviceResourceParameter.canInstantiate(obj))
        	return new DeviceResourceParameter(obj);
        else
        	throw new IllegalArgumentException("DeviceResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("09e191e6-69fc-452a-96e5-03474035f16e")
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
        DeviceResourceParameter other = (DeviceResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("3b7fe618-d20f-42db-9e75-b267c58337b6")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    @objid ("51d6433c-a762-4e71-8b8f-d012e179d94e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("fbade284-fc82-4d6f-a8bb-df17400e4032")
    protected DeviceResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("737be63a-9ec2-47e7-85a9-71e52a45dba3")
    public static final class MdaTypes {
        @objid ("2696122b-3886-4349-a4d4-67bc246cdc9c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b640d975-2b9f-470e-8626-98bbb4e350a1")
        private static Stereotype MDAASSOCDEP;

        @objid ("573c9883-1592-4615-b68e-5676d64f67a2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bfbaa90e-fc62-4407-9639-b3f3580518d7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "791952e3-0f48-11df-8c52-0014222a9f79");
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
