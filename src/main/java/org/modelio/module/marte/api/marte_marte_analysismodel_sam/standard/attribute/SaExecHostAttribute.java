/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.attribute.GaExecHostAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << SaExecHost_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("26095360-8d0a-41f7-9a42-25d0c1dbf3a9")
public class SaExecHostAttribute extends GaExecHostAttribute {
    @objid ("95c5b11d-6217-4134-9caf-bb0d913e3287")
    public static final String STEREOTYPE_NAME = "SaExecHost_Attribute";

    @objid ("683e4664-8938-41fd-a618-b1909cdfeb70")
    public static final String SAEXECHOST_ATTRIBUTE_ISRPRIORANGE_TAGTYPE = "SaExecHost_Attribute_ISRprioRange";

    @objid ("a02a478e-a547-4c3a-a212-63a0217e75ce")
    public static final String SAEXECHOST_ATTRIBUTE_ISRSWITCHT_TAGTYPE = "SaExecHost_Attribute_ISRswitchT";

    @objid ("ceed1bff-45eb-403b-93f7-c79641d95d05")
    public static final String SAEXECHOST_ATTRIBUTE_ISSCHED_TAGTYPE = "SaExecHost_Attribute_isSched";

    @objid ("b95ace0a-d367-41e8-b890-4154f6c3bbfb")
    public static final String SAEXECHOST_ATTRIBUTE_SCHSLACK_TAGTYPE = "SaExecHost_Attribute_schSlack";

    @objid ("86353b4e-b7a0-455b-9e9c-3aa6946119db")
    public static final String SAEXECHOST_ATTRIBUTE_SCHEDUTILIZ_TAGTYPE = "SaExecHost_Attribute_schedUtiliz";

    /**
     * Tells whether a {@link SaExecHostAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SaExecHost_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d061d029-c738-46c0-970e-570bb1353c6a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaExecHostAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SaExecHost_Attribute >> then instantiate a {@link SaExecHostAttribute} proxy.
     * 
     * @return a {@link SaExecHostAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("f26defb6-5e91-4061-808e-338bed403744")
    public static SaExecHostAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaExecHostAttribute.STEREOTYPE_NAME);
        return SaExecHostAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SaExecHostAttribute} proxy from a {@link Attribute} stereotyped << SaExecHost_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SaExecHostAttribute} proxy or <i>null</i>.
     */
    @objid ("f6416c59-ddb3-403e-8a55-c0756b9607cf")
    public static SaExecHostAttribute instantiate(final Attribute obj) {
        return SaExecHostAttribute.canInstantiate(obj) ? new SaExecHostAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaExecHostAttribute} proxy from a {@link Attribute} stereotyped << SaExecHost_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link SaExecHostAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f94997c0-6f1f-4470-9fc0-fd5cfd542559")
    public static SaExecHostAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SaExecHostAttribute.canInstantiate(obj))
        	return new SaExecHostAttribute(obj);
        else
        	throw new IllegalArgumentException("SaExecHostAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c2ccb42a-6a8a-4082-9c6f-de78ba10928d")
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
        SaExecHostAttribute other = (SaExecHostAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("219a3976-9fae-4030-919e-1838c28bb6f5")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'SaExecHost_Attribute_ISRprioRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("085edba4-5aa5-48a4-ba63-2a396a7fe9dc")
    public String getSaExecHost_Attribute_ISRprioRange() {
        return this.elt.getTagValue(SaExecHostAttribute.MdaTypes.SAEXECHOST_ATTRIBUTE_ISRPRIORANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Attribute_ISRswitchT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d7251fbe-e330-4493-b282-b24003e5c951")
    public String getSaExecHost_Attribute_ISRswitchT() {
        return this.elt.getTagValue(SaExecHostAttribute.MdaTypes.SAEXECHOST_ATTRIBUTE_ISRSWITCHT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Attribute_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("74e1b977-d040-45e9-9071-0f4bf9ea8618")
    public String getSaExecHost_Attribute_schSlack() {
        return this.elt.getTagValue(SaExecHostAttribute.MdaTypes.SAEXECHOST_ATTRIBUTE_SCHSLACK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Attribute_schedUtiliz'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("407e7781-34be-4757-8926-a05f1687ab90")
    public String getSaExecHost_Attribute_schedUtiliz() {
        return this.elt.getTagValue(SaExecHostAttribute.MdaTypes.SAEXECHOST_ATTRIBUTE_SCHEDUTILIZ_TAGTYPE_ELT);
    }

    @objid ("a5da1ef7-7349-41ff-83e7-ab4eb8471ade")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaExecHost_Attribute_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ad27aa97-fead-4294-99ac-5f635a4d8e59")
    public boolean isSaExecHost_Attribute_isSched() {
        return this.elt.isTagged(SaExecHostAttribute.MdaTypes.SAEXECHOST_ATTRIBUTE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaExecHost_Attribute_ISRprioRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("425a7a52-5c09-46fc-8977-b596730b891a")
    public void setSaExecHost_Attribute_ISRprioRange(final String value) {
        this.elt.putTagValue(SaExecHostAttribute.MdaTypes.SAEXECHOST_ATTRIBUTE_ISRPRIORANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaExecHost_Attribute_ISRswitchT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c53733d5-bbdc-4fc2-b5d4-ba4c42c0e33f")
    public void setSaExecHost_Attribute_ISRswitchT(final String value) {
        this.elt.putTagValue(SaExecHostAttribute.MdaTypes.SAEXECHOST_ATTRIBUTE_ISRSWITCHT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaExecHost_Attribute_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c31cd910-55ed-416f-bc93-1fcc76b2ffbe")
    public void setSaExecHost_Attribute_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaExecHostAttribute.MdaTypes.SAEXECHOST_ATTRIBUTE_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaExecHostAttribute.MdaTypes.SAEXECHOST_ATTRIBUTE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaExecHost_Attribute_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1cc8b305-8c87-4465-9278-7187a6726012")
    public void setSaExecHost_Attribute_schSlack(final String value) {
        this.elt.putTagValue(SaExecHostAttribute.MdaTypes.SAEXECHOST_ATTRIBUTE_SCHSLACK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaExecHost_Attribute_schedUtiliz'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0bd0b0fe-2dd6-4b6d-99ba-03566e51d0dc")
    public void setSaExecHost_Attribute_schedUtiliz(final String value) {
        this.elt.putTagValue(SaExecHostAttribute.MdaTypes.SAEXECHOST_ATTRIBUTE_SCHEDUTILIZ_TAGTYPE_ELT, value);
    }

    @objid ("6c555489-68d6-429c-bd50-a9064ae4a754")
    protected SaExecHostAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("4410096c-418c-4688-b761-2d6c23f24564")
    public static final class MdaTypes {
        @objid ("c68e7736-9275-4040-a8a7-a11ebef07c22")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("437cf06a-ceea-4214-98e2-f03e3273a583")
        public static TagType SAEXECHOST_ATTRIBUTE_ISSCHED_TAGTYPE_ELT;

        @objid ("58b306ab-23d2-42cb-b56f-6f574eb2143c")
        public static TagType SAEXECHOST_ATTRIBUTE_SCHSLACK_TAGTYPE_ELT;

        @objid ("119ce90d-5fd7-4f29-811e-1ac376281679")
        public static TagType SAEXECHOST_ATTRIBUTE_SCHEDUTILIZ_TAGTYPE_ELT;

        @objid ("5f845fb7-445a-4cd2-9f93-2aec670a8755")
        public static TagType SAEXECHOST_ATTRIBUTE_ISRSWITCHT_TAGTYPE_ELT;

        @objid ("3b68c382-c96b-4d88-9f9f-b1e8e3448c8b")
        public static TagType SAEXECHOST_ATTRIBUTE_ISRPRIORANGE_TAGTYPE_ELT;

        @objid ("44770906-20ae-479b-b799-cd7adea4fae6")
        private static Stereotype MDAASSOCDEP;

        @objid ("b7f34cc8-933d-4b8f-a0e2-093d3d728b35")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e6cb4098-a551-4d02-b792-a920deb1d1a8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03a156eb-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_ATTRIBUTE_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b93d-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_ATTRIBUTE_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b944-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_ATTRIBUTE_SCHEDUTILIZ_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b94b-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_ATTRIBUTE_ISRSWITCHT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b952-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_ATTRIBUTE_ISRPRIORANGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b959-0ccf-11df-8525-001302895b2b");
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
