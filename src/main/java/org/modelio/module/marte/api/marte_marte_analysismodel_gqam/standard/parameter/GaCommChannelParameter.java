/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.parameter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.SchedulableResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << GaCommChannel_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("03c8b070-55fd-470f-8f71-3b2d0f40a7f0")
public class GaCommChannelParameter extends SchedulableResourceParameter {
    @objid ("78b890d4-ccfa-4cbe-92be-dd79ec96b972")
    public static final String STEREOTYPE_NAME = "GaCommChannel_Parameter";

    @objid ("615f2546-d580-435d-8edc-cbcef9eed8ba")
    public static final String GACOMMCHANNEL_PARAMETER_PACKETSIZE_TAGTYPE = "GaCommChannel_Parameter_packetSize";

    @objid ("9db6177d-8455-41c8-94ee-5298a8aeceb0")
    public static final String GACOMMCHANNEL_PARAMETER_UTILIZATION_TAGTYPE = "GaCommChannel_Parameter_utilization";

    /**
     * Tells whether a {@link GaCommChannelParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << GaCommChannel_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f0d4971f-2ffc-4b6b-ae5e-923e617cc957")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << GaCommChannel_Parameter >> then instantiate a {@link GaCommChannelParameter} proxy.
     * 
     * @return a {@link GaCommChannelParameter} proxy on the created {@link Parameter}.
     */
    @objid ("8e04edb7-a564-42a9-8523-aa3fafb25d56")
    public static GaCommChannelParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelParameter.STEREOTYPE_NAME);
        return GaCommChannelParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link GaCommChannelParameter} proxy from a {@link Parameter} stereotyped << GaCommChannel_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link GaCommChannelParameter} proxy or <i>null</i>.
     */
    @objid ("97e62cd4-3570-4694-a3b5-d9e975fba983")
    public static GaCommChannelParameter instantiate(final Parameter obj) {
        return GaCommChannelParameter.canInstantiate(obj) ? new GaCommChannelParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaCommChannelParameter} proxy from a {@link Parameter} stereotyped << GaCommChannel_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link GaCommChannelParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5937ede3-4fc8-4474-8e19-fe2c1d6dd080")
    public static GaCommChannelParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (GaCommChannelParameter.canInstantiate(obj))
        	return new GaCommChannelParameter(obj);
        else
        	throw new IllegalArgumentException("GaCommChannelParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a55a405b-b100-4fc1-93e2-a38ccc528aee")
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
        GaCommChannelParameter other = (GaCommChannelParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("7f8f9b47-4e5f-43aa-af81-68081c7f72c1")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'GaCommChannel_Parameter_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0ee953b5-da20-4f94-8da2-8fd9ef6a004d")
    public String getGaCommChannel_Parameter_packetSize() {
        return this.elt.getTagValue(GaCommChannelParameter.MdaTypes.GACOMMCHANNEL_PARAMETER_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommChannel_Parameter_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("56f50390-f895-48d2-b5bf-25c8de331a75")
    public List<String> getGaCommChannel_Parameter_utilization() {
        return this.elt.getTagValues(GaCommChannelParameter.MdaTypes.GACOMMCHANNEL_PARAMETER_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("128d8cac-ca53-4f46-b870-bf7f77406438")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GaCommChannel_Parameter_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("91dddb4e-2e61-42f7-a6c8-0252a0e3f676")
    public void setGaCommChannel_Parameter_packetSize(final String value) {
        this.elt.putTagValue(GaCommChannelParameter.MdaTypes.GACOMMCHANNEL_PARAMETER_PACKETSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommChannel_Parameter_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1a538b56-ab5c-481d-a6c4-0744e1eb1674")
    public void setGaCommChannel_Parameter_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommChannelParameter.MdaTypes.GACOMMCHANNEL_PARAMETER_UTILIZATION_TAGTYPE_ELT, values);
    }

    @objid ("a4a73016-6aef-471d-9fdb-4bb757dab599")
    protected GaCommChannelParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("d15d603b-bedc-4b30-bd41-65105ff1b715")
    public static final class MdaTypes {
        @objid ("5764826a-fb34-4454-86c8-1dd9591353ae")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("861b720b-7b4d-45ed-a390-63e7f9aca744")
        public static TagType GACOMMCHANNEL_PARAMETER_PACKETSIZE_TAGTYPE_ELT;

        @objid ("4a0765fe-2ea9-4284-aded-09c5a4bb7f5f")
        public static TagType GACOMMCHANNEL_PARAMETER_UTILIZATION_TAGTYPE_ELT;

        @objid ("0c182eb5-7eca-4f51-a5fe-069ae29b4ead")
        private static Stereotype MDAASSOCDEP;

        @objid ("6dac0951-9911-4362-9f56-5eee5d04bca0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b4fcb619-8025-424a-8035-05260d5c4f8a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "036ce3e7-0ccf-11df-8525-001302895b2b");
            GACOMMCHANNEL_PARAMETER_PACKETSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "036f4630-0ccf-11df-8525-001302895b2b");
            GACOMMCHANNEL_PARAMETER_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "036f4637-0ccf-11df-8525-001302895b2b");
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
