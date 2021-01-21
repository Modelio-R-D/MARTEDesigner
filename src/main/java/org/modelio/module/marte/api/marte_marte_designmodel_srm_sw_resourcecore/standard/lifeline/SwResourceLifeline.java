/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.ResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << SwResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("cf909382-5f98-4fe6-a110-d1afee5dccd7")
public class SwResourceLifeline extends ResourceLifeline {
    @objid ("4c8f4ff5-fb17-443d-bded-c482e1ab9d3a")
    public static final String STEREOTYPE_NAME = "SwResource_Lifeline";

    @objid ("63e6a35b-b169-44b8-90bb-a27279f212aa")
    public static final String SWRESOURCE_LIFELINE_CREATESERVICES_TAGTYPE = "SwResource_Lifeline_createServices";

    @objid ("3dd9f5ce-cda8-441c-a0ac-b524fc6fd8d5")
    public static final String SWRESOURCE_LIFELINE_DELETESERVICES_TAGTYPE = "SwResource_Lifeline_deleteServices";

    @objid ("826b9213-eeba-4a3f-ae0b-1c545d2b7359")
    public static final String SWRESOURCE_LIFELINE_IDENTIFIERELEMENTS_TAGTYPE = "SwResource_Lifeline_identifierElements";

    @objid ("45e4170e-2776-49aa-b74c-b1688249f3e6")
    public static final String SWRESOURCE_LIFELINE_INITIALIZESERVICES_TAGTYPE = "SwResource_Lifeline_initializeServices";

    @objid ("54c0a1c9-b3b1-4cbb-95ff-05ec9e6977bd")
    public static final String SWRESOURCE_LIFELINE_MEMORYSIZEFOOTPRINT_TAGTYPE = "SwResource_Lifeline_memorySizeFootprint";

    @objid ("85147fc8-84d8-4eae-a55a-b998ff4fa8c0")
    public static final String SWRESOURCE_LIFELINE_STATEELEMENTS_TAGTYPE = "SwResource_Lifeline_stateElements";

    /**
     * Tells whether a {@link SwResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SwResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("be95946d-b8b4-44b2-9226-6f42d68beff9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SwResource_Lifeline >> then instantiate a {@link SwResourceLifeline} proxy.
     * 
     * @return a {@link SwResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("4abc1cba-8940-45bc-a960-e643c491b69d")
    public static SwResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceLifeline.STEREOTYPE_NAME);
        return SwResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SwResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SwResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("b8adc31d-6cfa-4180-848e-715c4f79bf2f")
    public static SwResourceLifeline instantiate(final Lifeline obj) {
        return SwResourceLifeline.canInstantiate(obj) ? new SwResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link SwResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8adc8a4e-717b-494d-a0ea-0266f6265b2b")
    public static SwResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SwResourceLifeline.canInstantiate(obj))
        	return new SwResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("SwResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("11788203-d810-413e-a25c-65a53dc73e36")
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
        SwResourceLifeline other = (SwResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("86720b57-d721-4930-beb0-d3ca35059080")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwResource_Lifeline_createServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c4860c9a-2e3b-49c3-b0f4-33958d472be3")
    public List<String> getSwResource_Lifeline_createServices() {
        return this.elt.getTagValues(SwResourceLifeline.MdaTypes.SWRESOURCE_LIFELINE_CREATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Lifeline_deleteServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b45307c9-2dfa-49dd-83ca-9c4133363c50")
    public List<String> getSwResource_Lifeline_deleteServices() {
        return this.elt.getTagValues(SwResourceLifeline.MdaTypes.SWRESOURCE_LIFELINE_DELETESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Lifeline_identifierElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("97753df2-0ebf-46a4-b198-4248604a936c")
    public List<String> getSwResource_Lifeline_identifierElements() {
        return this.elt.getTagValues(SwResourceLifeline.MdaTypes.SWRESOURCE_LIFELINE_IDENTIFIERELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Lifeline_initializeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("01560ad7-f3ad-4f9b-81b4-f697eb87de5d")
    public List<String> getSwResource_Lifeline_initializeServices() {
        return this.elt.getTagValues(SwResourceLifeline.MdaTypes.SWRESOURCE_LIFELINE_INITIALIZESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwResource_Lifeline_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("320d3011-cd9c-4b98-9f0b-a0c974f03325")
    public String getSwResource_Lifeline_memorySizeFootprint() {
        return this.elt.getTagValue(SwResourceLifeline.MdaTypes.SWRESOURCE_LIFELINE_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Lifeline_stateElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("705b7e00-71fd-4fb6-9381-fa24a19ea41d")
    public List<String> getSwResource_Lifeline_stateElements() {
        return this.elt.getTagValues(SwResourceLifeline.MdaTypes.SWRESOURCE_LIFELINE_STATEELEMENTS_TAGTYPE_ELT);
    }

    @objid ("fcc505d5-5641-4666-9e32-c76f3eeeb393")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwResource_Lifeline_createServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("65d19a93-9046-4589-93fe-9dbd043042ad")
    public void setSwResource_Lifeline_createServices(final List<String> values) {
        this.elt.putTagValues(SwResourceLifeline.MdaTypes.SWRESOURCE_LIFELINE_CREATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Lifeline_deleteServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("80627d7a-9096-49a1-80a6-a3d1a69d0216")
    public void setSwResource_Lifeline_deleteServices(final List<String> values) {
        this.elt.putTagValues(SwResourceLifeline.MdaTypes.SWRESOURCE_LIFELINE_DELETESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Lifeline_identifierElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7fe541a3-9abd-4e78-a03c-ff5928c2faa7")
    public void setSwResource_Lifeline_identifierElements(final List<String> values) {
        this.elt.putTagValues(SwResourceLifeline.MdaTypes.SWRESOURCE_LIFELINE_IDENTIFIERELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Lifeline_initializeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d7e739a3-89ea-4f06-ad29-57b05fa7e6b5")
    public void setSwResource_Lifeline_initializeServices(final List<String> values) {
        this.elt.putTagValues(SwResourceLifeline.MdaTypes.SWRESOURCE_LIFELINE_INITIALIZESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwResource_Lifeline_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("14bb0cd0-dfbc-4363-bd1b-142e99e2e4dd")
    public void setSwResource_Lifeline_memorySizeFootprint(final String value) {
        this.elt.putTagValue(SwResourceLifeline.MdaTypes.SWRESOURCE_LIFELINE_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwResource_Lifeline_stateElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("83564d2d-bade-4f44-a338-827382b6df62")
    public void setSwResource_Lifeline_stateElements(final List<String> values) {
        this.elt.putTagValues(SwResourceLifeline.MdaTypes.SWRESOURCE_LIFELINE_STATEELEMENTS_TAGTYPE_ELT, values);
    }

    @objid ("f993f52f-c896-4970-bc8d-809e9f8f5a03")
    protected SwResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("d0bdf7aa-1317-4343-bfd3-3c262c14aca6")
    public static final class MdaTypes {
        @objid ("374c546a-ac7f-44fe-abca-f0e6bc11fd55")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e2da8882-6ce6-4eb5-94e2-a5565d47db68")
        public static TagType SWRESOURCE_LIFELINE_IDENTIFIERELEMENTS_TAGTYPE_ELT;

        @objid ("259ea461-2f3c-44fe-b449-485b7480a0f0")
        public static TagType SWRESOURCE_LIFELINE_STATEELEMENTS_TAGTYPE_ELT;

        @objid ("293710e5-e354-48e1-b50e-ff671290e6a2")
        public static TagType SWRESOURCE_LIFELINE_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT;

        @objid ("63ac3e66-e64a-4fdf-80ed-1b22d669bcae")
        public static TagType SWRESOURCE_LIFELINE_CREATESERVICES_TAGTYPE_ELT;

        @objid ("714e2394-6e7f-4c33-8c3d-a552186c017c")
        public static TagType SWRESOURCE_LIFELINE_DELETESERVICES_TAGTYPE_ELT;

        @objid ("a5eb35a6-29ad-4fb9-819a-f3b87cb59ac0")
        public static TagType SWRESOURCE_LIFELINE_INITIALIZESERVICES_TAGTYPE_ELT;

        @objid ("353011d0-9aa6-48e6-8bb0-c648811d51c2")
        private static Stereotype MDAASSOCDEP;

        @objid ("2ad54879-2a53-4801-935a-a8d9f7b6cfac")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d1365a23-8d24-47f2-ba20-1eff0eb6fde6")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3e7983a2-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_LIFELINE_IDENTIFIERELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e7be601-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_LIFELINE_STATEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e7be602-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_LIFELINE_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e7983a3-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_LIFELINE_CREATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e7983a4-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_LIFELINE_DELETESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e7be5ff-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_LIFELINE_INITIALIZESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e7be600-10c0-11df-81d9-0014222a9f79");
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
