/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.port;

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
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Port} with << FlowPort_Port >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b7661c2b-574d-4cc1-873e-fd57695b9bb0")
public class FlowPortPort {
    @objid ("dbcc4ef3-2d2a-4008-b344-ef9cf46e28e9")
    public static final String STEREOTYPE_NAME = "FlowPort_Port";

    @objid ("aa23ab59-6ac3-4e3f-b83b-8ac17575e92d")
    public static final String FLOWPORT_PORT_DIRECTION_TAGTYPE = "FlowPort_Port_direction";

    @objid ("d9c5b42e-60da-4922-ad5a-5f30fdf5d919")
    public static final String FLOWPORT_PORT_ISATOMIC_TAGTYPE = "FlowPort_Port_isAtomic";

    /**
     * The underlying {@link Port} represented by this proxy, never null.
     */
    @objid ("b6ae2f00-3c1b-4420-be86-aae70fff34d9")
    protected final Port elt;

    /**
     * Tells whether a {@link FlowPortPort proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << FlowPort_Port >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e66258af-9139-4656-b640-aa3cd362453a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, FlowPortPort.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << FlowPort_Port >> then instantiate a {@link FlowPortPort} proxy.
     * 
     * @return a {@link FlowPortPort} proxy on the created {@link Port}.
     */
    @objid ("149e24af-561e-4079-bbec-d156753ced1b")
    public static FlowPortPort create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Port");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, FlowPortPort.STEREOTYPE_NAME);
        return FlowPortPort.instantiate((Port)e);
    }

    /**
     * Tries to instantiate a {@link FlowPortPort} proxy from a {@link Port} stereotyped << FlowPort_Port >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Port
     * @return a {@link FlowPortPort} proxy or <i>null</i>.
     */
    @objid ("e67221c1-c7f8-4d42-a24f-806a3a7dcab8")
    public static FlowPortPort instantiate(final Port obj) {
        return FlowPortPort.canInstantiate(obj) ? new FlowPortPort(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FlowPortPort} proxy from a {@link Port} stereotyped << FlowPort_Port >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Port}
     * @return a {@link FlowPortPort} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7ffd9e55-e9f1-47e7-a332-f0bbc27451bf")
    public static FlowPortPort safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (FlowPortPort.canInstantiate(obj))
        	return new FlowPortPort(obj);
        else
        	throw new IllegalArgumentException("FlowPortPort: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d0b9401c-1b99-44c1-bf74-bb51130096a4")
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
        FlowPortPort other = (FlowPortPort) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Port}. 
     * @return the Port represented by this proxy, never null.
     */
    @objid ("2ac529c6-3e7c-42c1-9c5f-53bec27f4f33")
    public Port getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'FlowPort_Port_direction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("994c83e5-5978-4bcd-923b-787fafd27555")
    public String getFlowPort_Port_direction() {
        return this.elt.getTagValue(FlowPortPort.MdaTypes.FLOWPORT_PORT_DIRECTION_TAGTYPE_ELT);
    }

    @objid ("4a841b87-cf93-4ff0-8951-901608b6f752")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'FlowPort_Port_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b478a71f-b934-4614-a1aa-21a2945debc2")
    public boolean isFlowPort_Port_isAtomic() {
        return this.elt.isTagged(FlowPortPort.MdaTypes.FLOWPORT_PORT_ISATOMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'FlowPort_Port_direction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("96c5c4f5-8039-4d80-9b41-66837208fd23")
    public void setFlowPort_Port_direction(final String value) {
        this.elt.putTagValue(FlowPortPort.MdaTypes.FLOWPORT_PORT_DIRECTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'FlowPort_Port_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ea7fdd66-3040-4133-a0ee-84bcfbea9b67")
    public void setFlowPort_Port_isAtomic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(FlowPortPort.MdaTypes.FLOWPORT_PORT_ISATOMIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(FlowPortPort.MdaTypes.FLOWPORT_PORT_ISATOMIC_TAGTYPE_ELT);
    }

    @objid ("78889f0f-83a1-4b89-a46d-9a87ca532b73")
    protected FlowPortPort(final Port elt) {
        this.elt = elt;
    }

    @objid ("83cc7522-221d-4aab-b593-4983b4a16738")
    public static final class MdaTypes {
        @objid ("5d36ebeb-cf98-4a04-9193-9331ecc4cfe6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("afdce551-d7a9-4529-a3ba-fe8ddb0cfc20")
        public static TagType FLOWPORT_PORT_ISATOMIC_TAGTYPE_ELT;

        @objid ("6d425ddc-28a7-4961-b20f-a3df46568101")
        public static TagType FLOWPORT_PORT_DIRECTION_TAGTYPE_ELT;

        @objid ("082d51c3-e8f2-4a6b-ace2-29721bec6275")
        private static Stereotype MDAASSOCDEP;

        @objid ("0bcfc941-0d7d-4483-9659-fde450d60ab3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f7e041ca-93fd-4c7f-bda0-cad31fff4037")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0247a67c-0ccf-11df-8525-001302895b2b");
            FLOWPORT_PORT_ISATOMIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0247a67d-0ccf-11df-8525-001302895b2b");
            FLOWPORT_PORT_DIRECTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0247a67f-0ccf-11df-8525-001302895b2b");
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
