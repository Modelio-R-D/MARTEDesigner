/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.parameter;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << InterruptResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("66cdb7d4-b905-4dcd-85a9-0693f1472253")
public class InterruptResourceParameter extends SwConcurrentResourceParameter {
    @objid ("d68e7c94-7e65-4d34-a8e7-ad1f0ab7a895")
    public static final String STEREOTYPE_NAME = "InterruptResource_Parameter";

    @objid ("7a5c25b4-28a7-4ac6-bffa-2f80b224b921")
    public static final String INTERRUPTRESOURCE_PARAMETER_ISMASKABLE_TAGTYPE = "InterruptResource_Parameter_isMaskable";

    @objid ("061fbf60-931a-4f82-ba96-960e46a90052")
    public static final String INTERRUPTRESOURCE_PARAMETER_KIND_TAGTYPE = "InterruptResource_Parameter_kind";

    @objid ("934f537b-48d8-4457-a6fa-93a4dbf1cbc0")
    public static final String INTERRUPTRESOURCE_PARAMETER_MASKELEMENTS_TAGTYPE = "InterruptResource_Parameter_maskElements";

    @objid ("089d71d3-c259-4d69-b5ec-c5c648407a78")
    public static final String INTERRUPTRESOURCE_PARAMETER_ROUTINECONNECTSERVICES_TAGTYPE = "InterruptResource_Parameter_routineConnectServices";

    @objid ("865f7fea-ee7d-488e-8695-158b38d4848f")
    public static final String INTERRUPTRESOURCE_PARAMETER_ROUTINEDISCONNECTSERVICES_TAGTYPE = "InterruptResource_Parameter_routineDisconnectServices";

    @objid ("813449f8-6f5a-4dc7-9d1c-0dd050f04818")
    public static final String INTERRUPTRESOURCE_PARAMETER_VECTORELEMENTS_TAGTYPE = "InterruptResource_Parameter_vectorElements";

    /**
     * Tells whether a {@link InterruptResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << InterruptResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8c7aba01-2884-4c8d-a27b-f684850bf8fc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << InterruptResource_Parameter >> then instantiate a {@link InterruptResourceParameter} proxy.
     * 
     * @return a {@link InterruptResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("d4575f87-4234-4588-b2e1-a8ecaecc3e35")
    public static InterruptResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceParameter.STEREOTYPE_NAME);
        return InterruptResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link InterruptResourceParameter} proxy from a {@link Parameter} stereotyped << InterruptResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link InterruptResourceParameter} proxy or <i>null</i>.
     */
    @objid ("5a9b66da-54a3-433c-bce3-1480d1e18b18")
    public static InterruptResourceParameter instantiate(final Parameter obj) {
        return InterruptResourceParameter.canInstantiate(obj) ? new InterruptResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link InterruptResourceParameter} proxy from a {@link Parameter} stereotyped << InterruptResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link InterruptResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f5a8353a-3c37-4951-a4e6-8de96c254498")
    public static InterruptResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (InterruptResourceParameter.canInstantiate(obj))
        	return new InterruptResourceParameter(obj);
        else
        	throw new IllegalArgumentException("InterruptResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ccbe427a-bfba-472b-8148-3156a7b1b318")
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
        InterruptResourceParameter other = (InterruptResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("05805ffd-1c1d-48f2-9d87-a85067da02ee")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'InterruptResource_Parameter_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0907c8e4-1f4f-469e-b7ae-6fc3d5aa59f2")
    public String getInterruptResource_Parameter_kind() {
        return this.elt.getTagValue(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Parameter_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("fa11fa1b-d746-41e3-848f-a672ca0b6c9b")
    public List<String> getInterruptResource_Parameter_maskElements() {
        return this.elt.getTagValues(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Parameter_routineConnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b2691ba9-3d19-4e3b-992c-b52d339a2401")
    public List<String> getInterruptResource_Parameter_routineConnectServices() {
        return this.elt.getTagValues(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_ROUTINECONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Parameter_routineDisconnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("adb2ff27-8f4d-4049-b08d-1077b660ebed")
    public List<String> getInterruptResource_Parameter_routineDisconnectServices() {
        return this.elt.getTagValues(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Parameter_vectorElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("377e7c27-3b71-4a78-8aa0-e93a80c6142c")
    public List<String> getInterruptResource_Parameter_vectorElements() {
        return this.elt.getTagValues(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_VECTORELEMENTS_TAGTYPE_ELT);
    }

    @objid ("d09432b7-d440-4d0d-907c-12643915656f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'InterruptResource_Parameter_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9c9d8cfa-889a-45cb-9b8c-4b2583db9186")
    public boolean isInterruptResource_Parameter_isMaskable() {
        return this.elt.isTagged(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_ISMASKABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'InterruptResource_Parameter_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("18652220-495f-4018-ab01-749e08d23474")
    public void setInterruptResource_Parameter_isMaskable(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_ISMASKABLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_ISMASKABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'InterruptResource_Parameter_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("682912b0-3ba4-49e0-83b4-60fc9e79ff96")
    public void setInterruptResource_Parameter_kind(final String value) {
        this.elt.putTagValue(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Parameter_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("84de44f9-a1e4-4932-854e-c85b215f6f08")
    public void setInterruptResource_Parameter_maskElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Parameter_routineConnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fdd1f600-e329-4a04-a531-2772a3c5c587")
    public void setInterruptResource_Parameter_routineConnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_ROUTINECONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Parameter_routineDisconnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a773b2ab-9b29-4cbd-a0a7-e7fc1cd5b035")
    public void setInterruptResource_Parameter_routineDisconnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Parameter_vectorElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d1886271-28a4-4755-b65d-8c31d95164f2")
    public void setInterruptResource_Parameter_vectorElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceParameter.MdaTypes.INTERRUPTRESOURCE_PARAMETER_VECTORELEMENTS_TAGTYPE_ELT, values);
    }

    @objid ("d2dd9b8c-35cd-4db5-ba79-750e2112e3d6")
    protected InterruptResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("ff572fa1-46d7-40bd-8766-1dca2fa8be3d")
    public static final class MdaTypes {
        @objid ("4b3800a7-b604-4fc1-bd03-c4ab3d702f43")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0a1f475d-71e4-4e06-9bec-dc7dcdee9160")
        public static TagType INTERRUPTRESOURCE_PARAMETER_KIND_TAGTYPE_ELT;

        @objid ("ca8ededb-75d6-49d7-b03b-e510f991ba61")
        public static TagType INTERRUPTRESOURCE_PARAMETER_ISMASKABLE_TAGTYPE_ELT;

        @objid ("5f309f09-7a52-49bf-a89a-ce0045b03439")
        public static TagType INTERRUPTRESOURCE_PARAMETER_VECTORELEMENTS_TAGTYPE_ELT;

        @objid ("cc640329-a819-479c-ae46-3560b8b63ed0")
        public static TagType INTERRUPTRESOURCE_PARAMETER_MASKELEMENTS_TAGTYPE_ELT;

        @objid ("4983dd15-2c34-456f-afee-3d1e96e82919")
        public static TagType INTERRUPTRESOURCE_PARAMETER_ROUTINECONNECTSERVICES_TAGTYPE_ELT;

        @objid ("c5cc5e00-63cf-44fd-ad3c-779b7528db39")
        public static TagType INTERRUPTRESOURCE_PARAMETER_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT;

        @objid ("157d8fb1-4695-4309-af7c-ab370151756a")
        private static Stereotype MDAASSOCDEP;

        @objid ("1ec59546-f2db-45aa-b17c-43aa2c352f9f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("502510ad-57ca-49ab-99af-fb0f3d83f6d4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01bd5ff0-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_PARAMETER_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b82-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_PARAMETER_ISMASKABLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b89-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_PARAMETER_VECTORELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b90-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_PARAMETER_MASKELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b97-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_PARAMETER_ROUTINECONNECTSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b9e-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_PARAMETER_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01cbadd0-0ccf-11df-8525-001302895b2b");
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
