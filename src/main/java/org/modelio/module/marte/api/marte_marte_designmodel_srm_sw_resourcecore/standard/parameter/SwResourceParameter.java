/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.parameter;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.ResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << SwResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("5ed66380-708f-4d33-a07a-755f1eb3b7d8")
public class SwResourceParameter extends ResourceParameter {
    @objid ("c59e2fb8-f25d-4112-aa44-dc9419ceffc2")
    public static final String STEREOTYPE_NAME = "SwResource_Parameter";

    @objid ("10d69028-394b-4eae-bf80-f62465e372f3")
    public static final String SWRESOURCE_PARAMETER_CREATESERVICES_TAGTYPE = "SwResource_Parameter_createServices";

    @objid ("ae376cc0-86f3-48ab-86ca-d8646aa11a97")
    public static final String SWRESOURCE_PARAMETER_DELETESERVICES_TAGTYPE = "SwResource_Parameter_deleteServices";

    @objid ("f86b1125-a398-4dd0-90e8-8209d2f441c9")
    public static final String SWRESOURCE_PARAMETER_IDENTIFIERELEMENTS_TAGTYPE = "SwResource_Parameter_identifierElements";

    @objid ("8ca9e5d9-377c-44df-be0d-ebad28040f64")
    public static final String SWRESOURCE_PARAMETER_INITIALIZESERVICES_TAGTYPE = "SwResource_Parameter_initializeServices";

    @objid ("fa2fc4bc-c52b-47af-8bb2-db5219c270dc")
    public static final String SWRESOURCE_PARAMETER_MEMORYSIZEFOOTPRINT_TAGTYPE = "SwResource_Parameter_memorySizeFootprint";

    @objid ("7a9c1e5a-6990-480f-ae61-3eb7f2892b8c")
    public static final String SWRESOURCE_PARAMETER_STATEELEMENTS_TAGTYPE = "SwResource_Parameter_stateElements";

    /**
     * Tells whether a {@link SwResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << SwResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7dc671a0-9a0f-4f4c-b7b6-7aa1475b5c89")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << SwResource_Parameter >> then instantiate a {@link SwResourceParameter} proxy.
     * 
     * @return a {@link SwResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("6104776f-80d1-467a-922f-2aaa465cbf20")
    public static SwResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceParameter.STEREOTYPE_NAME);
        return SwResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link SwResourceParameter} proxy from a {@link Parameter} stereotyped << SwResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link SwResourceParameter} proxy or <i>null</i>.
     */
    @objid ("c0685f2e-b592-4dcc-9730-53e31e7d0c52")
    public static SwResourceParameter instantiate(final Parameter obj) {
        return SwResourceParameter.canInstantiate(obj) ? new SwResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwResourceParameter} proxy from a {@link Parameter} stereotyped << SwResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link SwResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a128c8e3-884e-429f-9831-fa0863a46cfa")
    public static SwResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (SwResourceParameter.canInstantiate(obj))
        	return new SwResourceParameter(obj);
        else
        	throw new IllegalArgumentException("SwResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f17bb2d9-cedb-4d32-ab62-95e95ee578f3")
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
        SwResourceParameter other = (SwResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("bfeb50d6-7b19-4c4c-ae4d-07c500829a78")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwResource_Parameter_createServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d14fd089-8e81-4557-8341-bff48954ea4e")
    public List<String> getSwResource_Parameter_createServices() {
        return this.elt.getTagValues(SwResourceParameter.MdaTypes.SWRESOURCE_PARAMETER_CREATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Parameter_deleteServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a110b641-7f00-4df8-a53b-0a9ff5521c8d")
    public List<String> getSwResource_Parameter_deleteServices() {
        return this.elt.getTagValues(SwResourceParameter.MdaTypes.SWRESOURCE_PARAMETER_DELETESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Parameter_identifierElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5c54aa0f-5b4e-433e-ab53-ef1efcc64189")
    public List<String> getSwResource_Parameter_identifierElements() {
        return this.elt.getTagValues(SwResourceParameter.MdaTypes.SWRESOURCE_PARAMETER_IDENTIFIERELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Parameter_initializeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("83542303-d9c4-4596-be8f-441b5f57a633")
    public List<String> getSwResource_Parameter_initializeServices() {
        return this.elt.getTagValues(SwResourceParameter.MdaTypes.SWRESOURCE_PARAMETER_INITIALIZESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwResource_Parameter_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("99568c55-cd61-4a8a-b6c6-0c986ca1dd72")
    public String getSwResource_Parameter_memorySizeFootprint() {
        return this.elt.getTagValue(SwResourceParameter.MdaTypes.SWRESOURCE_PARAMETER_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Parameter_stateElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ba515e40-c127-4a21-9e63-fb44519c2ae5")
    public List<String> getSwResource_Parameter_stateElements() {
        return this.elt.getTagValues(SwResourceParameter.MdaTypes.SWRESOURCE_PARAMETER_STATEELEMENTS_TAGTYPE_ELT);
    }

    @objid ("616a3a64-d97e-452d-b19a-0cbc990036e4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwResource_Parameter_createServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ed381627-7950-4aab-ae9f-371b60336365")
    public void setSwResource_Parameter_createServices(final List<String> values) {
        this.elt.putTagValues(SwResourceParameter.MdaTypes.SWRESOURCE_PARAMETER_CREATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Parameter_deleteServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a37c69b9-f653-42d7-9395-1460f4f6489e")
    public void setSwResource_Parameter_deleteServices(final List<String> values) {
        this.elt.putTagValues(SwResourceParameter.MdaTypes.SWRESOURCE_PARAMETER_DELETESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Parameter_identifierElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2d22dbaf-a1b1-4556-97fc-eb3d7a0613a6")
    public void setSwResource_Parameter_identifierElements(final List<String> values) {
        this.elt.putTagValues(SwResourceParameter.MdaTypes.SWRESOURCE_PARAMETER_IDENTIFIERELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Parameter_initializeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c8310f33-0f73-4b58-8c28-250936a5d689")
    public void setSwResource_Parameter_initializeServices(final List<String> values) {
        this.elt.putTagValues(SwResourceParameter.MdaTypes.SWRESOURCE_PARAMETER_INITIALIZESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwResource_Parameter_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c17fc0cf-6875-42e1-889c-9937cf0cec35")
    public void setSwResource_Parameter_memorySizeFootprint(final String value) {
        this.elt.putTagValue(SwResourceParameter.MdaTypes.SWRESOURCE_PARAMETER_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwResource_Parameter_stateElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("07b57c7a-20d0-418e-85d4-6a3239b935e2")
    public void setSwResource_Parameter_stateElements(final List<String> values) {
        this.elt.putTagValues(SwResourceParameter.MdaTypes.SWRESOURCE_PARAMETER_STATEELEMENTS_TAGTYPE_ELT, values);
    }

    @objid ("5068adda-eb8c-4567-a4a7-e1bb8c736537")
    protected SwResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("ca1969c8-3aaf-4f4c-9172-50282dffcfda")
    public static final class MdaTypes {
        @objid ("9d5bd1b5-0e6d-4d9c-a6c8-a8e024f2349b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cb32eeac-8722-4bf1-9d6f-0317deaa63a7")
        public static TagType SWRESOURCE_PARAMETER_IDENTIFIERELEMENTS_TAGTYPE_ELT;

        @objid ("478c8aa4-73a4-43cd-8d35-de1be9ce343a")
        public static TagType SWRESOURCE_PARAMETER_STATEELEMENTS_TAGTYPE_ELT;

        @objid ("5640f93f-f27d-4df6-970c-27525602bc92")
        public static TagType SWRESOURCE_PARAMETER_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT;

        @objid ("a4765e9a-8e65-4b1a-bf88-155fda442733")
        public static TagType SWRESOURCE_PARAMETER_CREATESERVICES_TAGTYPE_ELT;

        @objid ("cbca8ded-6eb8-4af7-9b57-ec533ce2d449")
        public static TagType SWRESOURCE_PARAMETER_DELETESERVICES_TAGTYPE_ELT;

        @objid ("1d497cd4-eb39-4fc5-8eeb-382f8adc40bc")
        public static TagType SWRESOURCE_PARAMETER_INITIALIZESERVICES_TAGTYPE_ELT;

        @objid ("29c87498-7a02-4ffa-8db9-a0c8f7ce8986")
        private static Stereotype MDAASSOCDEP;

        @objid ("ba74b2c2-4bbe-46d7-8cca-2c9c4b9c288c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1c127788-e503-4b3e-852e-6dc48bbdf443")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01a0c40a-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_PARAMETER_IDENTIFIERELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a32662-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_PARAMETER_STATEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a32669-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_PARAMETER_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a32670-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_PARAMETER_CREATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588b0-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_PARAMETER_DELETESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588b7-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_PARAMETER_INITIALIZESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588be-0ccf-11df-8525-001302895b2b");
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
